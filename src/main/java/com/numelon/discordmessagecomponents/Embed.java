package com.numelon.discordmessagecomponents;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashMap;

public class Embed {
    private EmbedAuthor author;

    private Colour embedColour;

    private String title;
    private String description;
    private String url;

    private List<EmbedField> fields;

    /* private List<String> imageUrls; */
    private String thumbnailUrl;

    private EmbedFooter footer;

    public Embed(String title, String description, String url, Colour embedColour, List<EmbedField> fields, String thumbnailUrl, /* List<String> imageUrls , */ EmbedAuthor author, EmbedFooter footer) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.embedColour = embedColour;

        this.fields = fields;
        this.thumbnailUrl = thumbnailUrl;
        /* this.imageUrls = imageUrls; */

        this.author = author;
        this.footer = footer;
    }

    // Get embed properties
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public Colour getColour() {
        return embedColour;
    }

    public List<EmbedField> getFields() {
        return fields;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /* public List<String> getImageUrls() {
        return imageUrls;
    } */

    public EmbedAuthor getAuthor() {
        return author;
    }

    public EmbedFooter getFooter() {
        return footer;
    }

    // Set embed properties
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setColour(Colour embedColour) {
        this.embedColour = embedColour;
    }

    public void setFields(List<EmbedField> fields) {
        this.fields = fields;
    }

    public void addField(EmbedField field) {
        fields.add(field);
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /* public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    } */

    /* public void addImageUrl(String imageUrl) {
        imageUrls.add(imageUrl);
    } */

    public void setAuthor(EmbedAuthor author) {
        this.author = author;
    }

    public void setFooter(EmbedFooter footer) {
        this.footer = footer;
    }

    // Json serialisation for export
    public String toJson() {
        Map<String, Object> embedMap = new HashMap<>();
        embedMap.put("title", this.title);
        embedMap.put("description", this.description);
        embedMap.put("url", this.url);
        embedMap.put("color", this.embedColour.toRGB());

        List<Map<String, String>> fieldsList = new ArrayList<>();
        for (EmbedField field: this.fields) {
            Map<String, String> fieldMap = new HashMap<>();
            fieldMap.put("name", field.getTitle());
            fieldMap.put("value", field.getValue());
            
            fieldsList.add(fieldMap);
        }
        embedMap.put("fields", fieldsList);

        Map<String, String> thumbnailMap = new HashMap<>();
        thumbnailMap.put("url", this.thumbnailUrl);
        embedMap.put("thumbnail", thumbnailMap);

        Map<String, String> authorMap = new HashMap<>();
        authorMap.put("name", this.author.getAuthor());
        authorMap.put("url", this.author.getUrl());
        authorMap.put("icon_url", this.author.getIconUrl());
        embedMap.put("author", authorMap);

        Map<String, String> footerMap = new HashMap<>();
        footerMap.put("text", this.footer.getFooter());
        footerMap.put("icon_url", this.footer.getIconUrl());
        embedMap.put("timestamp", this.footer.getTimestamp());
        embedMap.put("footer", footerMap);

        // use gson to export this object to json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(embedMap);
    }
}
