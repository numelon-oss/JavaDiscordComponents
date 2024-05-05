package com.numelon.discordmessagecomponents;

public class Colour {
    private int red = 0;
    private int green = 0;
    private int blue = 0;

    public Colour() {}

    // Get RGB (Discord Colour Integer)
    public int toRGB() {
        return (red << 16) + (green << 8) + blue;
    }

    // Get properties
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    // Set properties
    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    // Assign colour from colour formats
    public void fromRGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void fromHex(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }

        if (hex.length() != 6) {
            throw new IllegalArgumentException("Invalid hexadecimal string: " + hex + ". Must be a 6 character hex string, excluding hashtag (not mandatory).");
        }

        red = Integer.parseInt(hex.substring(0, 2), 16);
        green = Integer.parseInt(hex.substring(2, 4), 16);
        blue = Integer.parseInt(hex.substring(4, 6), 16);
    }
}
