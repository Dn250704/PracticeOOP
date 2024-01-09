package Class;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private final ArrayList<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    // Add a product to inventory from user
    public void addProductFromUserInput() {
        Product newProduct = Product.createProductFromUserInput();
        products.add(newProduct);
        System.out.println("Added a product to inventory: " + newProduct.getName());
        System.out.println("---------------------");
    }

    // Remove a product from inventory
    public void removeProduct() {
        System.out.print("Enter the product you want to remove: ");
        String name =  new Scanner(System.in).nextLine();
        System.out.println("---------------------");
        boolean exist = true;
        try {
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    products.remove(product);
                    System.out.println("Removed product from inventory: " + name);
                    System.out.println("---------------------");
                    exist = false;

                }else {
                    System.out.println("Not found product: " + name);
                    System.out.println("---------------------");
                    exist = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Product is " + name + " exist: " + exist);
        }
    }

    // Show list of products in stock
    public void displayInventory() {
        if (!products.isEmpty()) {
            System.out.println("======== Inventory ========");
            for (Product product : products) {
                System.out.println("Name: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("Amount: " + product.getQuantity());
                System.out.println("---------------------");
            }
        } else {
            System.out.println("Inventory is empty");
            System.out.println("---------------------");
        }
    }
}
