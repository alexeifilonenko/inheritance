package com.company.model;

public class Cube extends Rectangle{
    private int height;

    public Cube(String name, String color, int width, int length, int height) {
        super(name, color, width, length);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateSquare() * height;
    }
}
