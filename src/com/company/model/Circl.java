package com.company.model;

public class Circl extends Shape {
    private int radius;

    public Circl(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double calculateSquare() {
        return 3.14 * radius * radius;
    }
}
