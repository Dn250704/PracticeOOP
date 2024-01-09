package Class;

import java.util.Scanner;

public class ProductManagement {
    public static void Menu() {
        System.out.println("=============== Menu ===============");
        System.out.println("1. Add a product to inventory from user");
        System.out.println("2. Remove a product from inventory");
        System.out.println("3. Show list of products in stock");
        System.out.println("0. Exit");
        System.out.print("Please choose: ");
    }
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        while (true) {
            Menu();
            int choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1:
                    inventory.addProductFromUserInput();
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c1 = new Scanner(System.in).next().charAt(0);
                    if (c1 == 'Y' || c1 == 'y') {
                        break;
                    } else if (c1 == 'N' || c1 == 'n') {
                        System.exit(0);
                    }
                case 2:
                    inventory.removeProduct();
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c2 = new Scanner(System.in).next().charAt(0);
                    if (c2 == 'Y' || c2 == 'y') {
                        break;
                    } else if (c2 == 'N' || c2 == 'n') {
                        System.exit(0);
                    }
                case 3:
                    inventory.displayInventory();
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c3 = new Scanner(System.in).next().charAt(0);
                    if (c3 == 'Y' || c3 == 'y') {
                        break;
                    } else if (c3 == 'N' || c3 == 'n') {
                        System.exit(0);
                    }
                case 0:
                    System.out.print("Are you sure exit? (Y/N): ");
                    char c4 = new Scanner(System.in).next().charAt(0);
                    if (c4 == 'N' || c4 == 'n') {
                        break;
                    } else if (c4 == 'Y' || c4 == 'y') {
                        System.exit(0);
                    }
            }
        }
    }
}
