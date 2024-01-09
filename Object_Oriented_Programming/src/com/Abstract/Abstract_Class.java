package com.Abstract;

import java.util.*;
abstract class Shape {

    // Phương thức abstract calculateArea
    abstract double calculateArea();
}
class Circle extends Shape {

    // Thuộc tính radius của class com.Abstract.Circle
    private double radius;

    // Hàm tạo
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    // Thuộc tính width, height của lớp com.Abstract.Rectangle
    private double width, height;

    // Hàm tạo
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width * height;
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
        // With circle
        System.out.print("Enter radius: ");
        double r = new Scanner(System.in).nextDouble();
        Circle circle = new Circle(r);
        System.out.println("Area of circle: " + circle.calculateArea());
        System.out.print("Enter width of com.Abstract.Rectangle: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Enter height of com.Abstract.Rectangle: ");
        double height = new Scanner(System.in).nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
