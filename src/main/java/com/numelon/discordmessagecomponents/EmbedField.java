package com.numelon.discordmessagecomponents;

public class EmbedField {
    private String title = "Field Title";
    private String value = "Field Value";
    private boolean inline = false;

    public EmbedField(String title, String value, boolean inline) {
        this.title = title;
        this.value = value;
        this.inline = inline;
    }

    // Get Properties

    public String getTitle() {
        return title;
    }

    public String getValue() {
        return value;
    }

    public boolean isInline() {
        return inline;
    }

    // Set properties

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setInline(boolean inline) {
        this.inline = inline;
    }
}
