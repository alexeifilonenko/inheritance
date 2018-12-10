package com.company.model;

public class Cylinder extends Circl {
    private int height;

    public Cylinder(String name, String color, int radius, int height) {
        super(name, color, radius);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double calcalateVolume() {
        return calculateSquare() * height;
    }
}
