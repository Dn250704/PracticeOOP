import java.util.ArrayList;
import java.util.Scanner;

// Lớp biểu diễn một mục trong menu
class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

// Lớp quản lý nhà hàng và menu
class Restaurant {
    private String name;
    private double price;
    private String description;

    private ArrayList<MenuItem> menu;

    public Restaurant() {
        this.menu = new ArrayList<>();
    }

    // Thêm một mục vào menu
    public void addMenuItem(String name, double price, String description) {
        MenuItem newItem = new MenuItem(name, price, description);
        menu.add(newItem);
        System.out.println("Added new item to menu: " + name);
    }

    // Remove item from menu
    public void removeMenuItem(String name) {
        for (MenuItem item : menu) {
            if (item.getName().equals(name)) {
                menu.remove(item);
                System.out.println("Removed item from menu: " + name);
                return;
            }
        }
        System.out.println("Not found in menu: " + name);
    }

    // Show full menu
    public void displayMenu() {
        System.out.println("======== MENU ========");
        for (MenuItem item : menu) {
            System.out.println("Name: " + item.getName());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Description: " + item.getDescription());
            System.out.println("---------------------");
        }
    }
    // Input NameItem, Price, Description
    public void inputItem() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Item Name: ");
        name = input.nextLine();
        System.out.print("Enter Item Price: ");
        price = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Item Description: ");
        description = input.nextLine();
        input.close();
        System.out.println("---------------------");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
        System.out.println("---------------------");
    }
}

class RestaurantManagement {
    public static void main(String[] args) {
        // Tạo một nhà hàng
        Restaurant myRestaurant = new Restaurant();
        // Nhập vào menu
        myRestaurant.inputItem();

        // Thêm một số mục vào menu
        myRestaurant.addMenuItem("Bún riêu", 8.99, "Bún riêu cay nồng");
        myRestaurant.addMenuItem("Cơm chiên", 6.99, "Cơm chiên trứng và rau củ");

        // Hiển thị menu
        myRestaurant.displayMenu();

        // Xóa một mục khỏi menu
        myRestaurant.removeMenuItem("Bún riêu");

        // Hiển thị menu sau khi xóa
        myRestaurant.displayMenu();
    }
}