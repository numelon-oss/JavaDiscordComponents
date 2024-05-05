package com.numelon.discordmessagecomponents;

public class EmbedFooter {
    private String footer;
    // TODO: Add timestamp obkect
    private String timestamp;
    private String iconUrl;

    public EmbedFooter(String footer, String timestamp, String iconUrl) {
        this.footer = footer;
        this.timestamp = timestamp;
        this.iconUrl = iconUrl;
    }

    // Get Properties

    public String getFooter() {
        return footer;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    // Set properties

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
