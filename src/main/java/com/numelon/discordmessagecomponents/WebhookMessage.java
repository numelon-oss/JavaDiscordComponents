package com.numelon.discordmessagecomponents;

import java.util.List;

public class WebhookMessage {
    private String content = "";
    private List<String> embeds;
    private List<String> attachments;

    public WebhookMessage(String content, List<String> embeds, List<String> attachments) {
        this.content = content;
        this.embeds = embeds;
        this.attachments = attachments;
    }

    public String getContent() {
        return content;
    }

    public List<String> getEmbeds() {
        return embeds;
    }

    public List<String> getAttachments() {
        return attachments;
    }
}
