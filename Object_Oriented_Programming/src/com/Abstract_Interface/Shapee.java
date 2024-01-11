package com.Abstract_Interface;

import java.util.Scanner;

public abstract class Shapee {
    String color;
    boolean filled;

    // Constructor
    public Shapee(){}

    public Shapee(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Get/set color and filled
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract void draw();
}
interface Resizable {
    void resize();
}

class ResizableCircle extends Shapee implements Resizable {
    private double radius;

    public ResizableCircle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public ResizableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Resizable Circle");
    }

    @Override
    public void resize() {
        this.radius *= 2;
        System.out.println("Resizable Circle resized. New radius: " + this.radius);
    }
}

class Ex4 {
    public static void main(String[] args) {
        System.out.print("Enter new radius: ");
        double radius = new Scanner(System.in).nextDouble();
        ResizableCircle changesize = new ResizableCircle(radius);
        changesize.draw();
        changesize.resize();
    }
}

