package Class;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;
    public Product(){}
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    // Update amount product in inventory
    public void updateQuantity(int amount) {
        this.quantity += amount;
    }

    // Input product info
    public static Product createProductFromUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product's Name: ");
        String name = input.nextLine();
        System.out.println("Enter Product's Price: ");
        double price = input.nextDouble();
        System.out.println("Enter Amount: ");
        int quantity = input.nextInt();
        return new Product(name, price, quantity);
    }
}
