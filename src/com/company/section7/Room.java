package com.company.section7;

public class Room {
    private int width;
    private int height;
    private int length;
    private TV tv;

    public Room(int width, int height, int length, TV tv) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.tv = tv;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public TV getTv() {
        return tv;
    }
}
