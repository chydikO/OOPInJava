package com.mainacad;

import com.mainacad.model.*;

public class ApplicationRunner {

    /**
     * Task: В классах Треугольник, Квадрат, Круг и Прямоугольник сделать конструкторы.
     * Создать екземпляры этих классов в методе main и найти фигуру с максимальной площадью.
     * Вывести ее значение
     * @param args
     */

    public static void main(String[] args) {

        Shape maxShape;

        Circle circle = new Circle(10);
        Square square = new Square(15);
        Triangle triangle = new Triangle(12, 15);
        Quadrilateral quadrilateral = new Quadrilateral(22, 33);
        Rectangle rectangle = new Rectangle( 43, 34);

        maxShape = circle;

        if (maxShape.getArea() < square.getArea()) {
            maxShape = square;
        } else if(maxShape.getArea() < triangle.getArea()) {
           maxShape = triangle;
        } else if(maxShape.getArea() < quadrilateral.getArea()) {
            maxShape = square;
        }else if(maxShape.getArea() < rectangle.getArea()) {
            maxShape = rectangle;
        }

        System.out.println("Max shape has area " + maxShape.getArea());
    }
}
