package com.Interface;
// Interface Drawable
public interface Drawable {
    void draw();
}

// Circle class implementing Drawable interface
class Circle implements Drawable {
    // Implementing draw method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Rectangle class implementing Drawable interface
class Rectangle implements Drawable {
    // Implementing draw method for Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Main class to test the interface and implementations
class Main {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Drawing Circle
        circle.draw();

        // Drawing Rectangle
        rectangle.draw();
    }
}
