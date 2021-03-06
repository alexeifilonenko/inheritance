package com.company.model;

public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(String name, String color, int width, int length) {
        super(name, color);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calculateSquare() {
        return width * length;
    }
}
