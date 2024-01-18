import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    // Constructors
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle is: " + radius * Math.pow(Math.PI,2));
    }
}

class Rectangle extends Shape {
    private double weight;
    private double height;

    // Constructor
    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Getter and Setter
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle is: " + (weight * height));
    }
}

public class Ex4 {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        double radius = new Scanner(System.in).nextDouble();
        Circle circle = new Circle(radius);
        circle.calculateArea();

        System.out.print("Enter width: ");
        double width = new Scanner(System.in).nextDouble();
        System.out.println("Enter height: ");
        double height = new Scanner(System.in).nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.calculateArea();
    }
}
