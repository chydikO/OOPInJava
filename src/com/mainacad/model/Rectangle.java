package com.mainacad.model;

public class Rectangle extends AbstractShape {

    private double sideA;
    private double sideB;

    public Rectangle() {
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
