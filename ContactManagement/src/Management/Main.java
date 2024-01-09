package Management;

import java.util.Scanner;

public class Main {
    public static void Menu() {
        System.out.println("==================== Menu ====================");
        System.out.println("1. Add a phone number to contact");
        System.out.println("2. Update a phone number");
        System.out.println("3. Remove a phone number from contact (Updating)");
        System.out.println("4. Show list contact");
        System.out.println("5. Find a person from contact");
        System.out.println("0. Exit");
        System.out.print("Please choose: ");
    }
    public static void main(String[] args) {
        ContactManagement myContact = new ContactManagement();
        while (true) {
            Menu();
            int choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1:
                    myContact.addContact();
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c1 = new Scanner(System.in).next().charAt(0);
                    if (c1 == 'Y' || c1 == 'y') {
                        break;
                    } else if (c1 == 'N' || c1 == 'n') {
                        System.exit(0);
                    }
                case 2:
                    myContact.updateContact();
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c2 = new Scanner(System.in).next().charAt(0);
                    if (c2 == 'Y' || c2 == 'y') {
                        break;
                    } else if (c2 == 'N' || c2 == 'n') {
                        System.exit(0);
                    }
                case 3:
                    System.out.println("This function is updating");
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c3 = new Scanner(System.in).next().charAt(0);
                    if (c3 == 'Y' || c3 == 'y') {
                        break;
                    } else if (c3 == 'N' || c3 == 'n') {
                        System.exit(0);
                    }
                case 4:
                    myContact.ShowContact();
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c4 = new Scanner(System.in).next().charAt(0);
                    if (c4 == 'Y' || c4 == 'y') {
                        break;
                    } else if (c4 == 'N' || c4 == 'n') {
                        System.exit(0);
                    }
                case 5:
                    System.out.print("Enter name: ");
                    String name = new Scanner(System.in).nextLine();
                    myContact.FindContact(name);
                    System.out.print("Do you want to continue this program? (Y/N): ");
                    char c5 = new Scanner(System.in).next().charAt(0);
                    if (c5 == 'Y' || c5 == 'y') {
                        break;
                    } else if (c5 == 'N' || c5 == 'n') {
                        System.exit(0);
                    }
                case 0:
                    System.out.print("Are you sure exit? (Y/N): ");
                    char c0 = new Scanner(System.in).next().charAt(0);
                    if (c0 == 'N' || c0 == 'n') {
                        break;
                    } else if (c0 == 'Y' || c0 == 'y') {
                        System.exit(0);
                    }
            }
        }
    }
}
