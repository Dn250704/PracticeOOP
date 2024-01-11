package com.Abstract_Interface.Ex1;

import java.util.Scanner;

abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}
public interface Drawable {
    void draw();
}

// Class Circle inheritance Shape and interface Drawable
class Circle extends Shape implements Drawable {

    // Radius of the circle
    private double radius;

    // Constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea method for circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Implementing draw method for circle
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Class Rectangle inheritance Shape and interface Drawable
class Rectangle extends Shape implements Drawable {

    // Width, height of the Rectangle
    private double width;
    private double height;

    // Constructor
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implement calculateArea method for Rectangle
    @Override
    double calculateArea() {
        return width * height;
    }
    // Implement draw method for Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println("");
        }
    }
}

class Men {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle: ");
        double radius = new Scanner(System.in).nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of circle: " + circle.calculateArea());
        circle.draw();

        System.out.print("Enter width of Rectangle: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.print("Enter height of Rectangle: ");
        double height = new Scanner(System.in).nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        rectangle.draw();
    }
}
