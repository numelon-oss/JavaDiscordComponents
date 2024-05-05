package com.numelon.discordmessagecomponents;

public class EmbedAuthor {
    private String author = "Embed Author";
    private String url;
    private String iconUrl;

    public EmbedAuthor(String author, String url, String iconUrl) {
        // author is mandatory for the creation of this class
        this.author = author;

        // URL is not a mandatory argument
        if (url != null) {
            this.url = url;
        }

        // iconUrl is not a mandatory argument
        if (iconUrl != null) {
            this.iconUrl = iconUrl;
        }
    }

    // Get Properties

    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    // Set properties

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
