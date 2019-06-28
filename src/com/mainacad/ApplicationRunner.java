package com.mainacad;

import com.mainacad.model.*;

public class ApplicationRunner {

    public static void main(String[] args) {

        Circle circle = new Circle(10);


        Square square = new Square(15);


        Triangle triangle = new Triangle(12, 15);

        Shape maxShape;

        if (circle.getArea() > square.getArea()) {
            maxShape = circle;
        }
        else if(circle.getArea() < square.getArea()){
            maxShape = square;
        }
        else {
            maxShape = square;
        }

        if (maxShape.getArea() < triangle.getArea()){
            maxShape = triangle;
        }

        System.out.println("Max shape has area " + maxShape.getArea());
    }
}
