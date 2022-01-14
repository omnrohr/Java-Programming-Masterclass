package com.company.section7;

public class TV {
    private int width;
    private int height;
    private String manufacturer;
    private Sound sound;

    public TV(int width, int height, String manufacturer, Sound sound) {
        this.width = width;
        this.height = height;
        this.manufacturer = manufacturer;
        this.sound = sound;
    }
    public void tvOn(){
        System.out.println("Tv turned on,");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Sound getSound() {
        return sound;
    }
}
