package com.company;

import com.company.model.Circl;
import com.company.model.Cube;
import com.company.model.Cylinder;
import com.company.model.Rectangle;

public class Main {

    public static void main(String[] args) {
        Circl circl = new Circl("Circl", "Red", 10);
        System.out.println(circl.calculateSquare(10));
        Cylinder cylinder = new Cylinder("Cylinder", "Blue", 15, 25);
        System.out.println(cylinder.calcalateVolume(25));
        Rectangle rectangle = new Rectangle("Rectangle", "Green", 15, 25);
        System.out.println(rectangle.calculateSquare(15, 25));
        Cube cube = new Cube("Cube", "Yellow", 10, 15, 20);
        System.out.println(cube.calculateVolume(20));
    }
}
