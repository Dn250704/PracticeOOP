package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagement {
    private final ArrayList<Contact> contacts;
    public ContactManagement() {
        this.contacts = new ArrayList<>();
    }

    // Phương thức kiểm duyệt danh sách
    public boolean checkExist(String getPhonenum) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(getPhonenum)) {
                return true;
            }
        }
        return false;
    }

    // 1. Phương thức thêm thông tin liên hệ
    public void addContact() {
        Contact newContact = Contact.createContactFromUserInput();
        if (!checkExist(newContact.getPhoneNumber())) {
            contacts.add(newContact);
            System.out.println("Added phone number to contact");
            System.out.println("==============================================");
        } else {
            System.out.println("This phone number is exist in contact");
            System.out.println("==============================================");
        }
    }

    // 2. Phương thức sửa thông tin liên hệ
    public void updateContact() {
        System.out.print("Enter phone number want to update: ");
        String uPhone = new Scanner(System.in).nextLine();
        System.out.println("==============================================");
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(uPhone)) {
                System.out.print("Enter new phone number: ");
                String nPhone = new Scanner(System.in).nextLine();
                System.out.println("==============================================");
                if (!checkExist(nPhone)) {
                    contact.setPhoneNumber(nPhone);
                    System.out.println("Updated phone number");
                    System.out.println("==============================================");
                } else {
                    System.out.println("New phone number is exist in contact");
                    System.out.println("==============================================");
                }
                return;
            }
        }
        System.out.println("Could not find contacts with the phone number that needs to be corrected");
        System.out.println("==============================================");
    }

    // 3. Phương thức xoá danh bạ
    public void RemoveContact() {

    }

    // 4. Phương thức hiển thị danh sách danh bạ
    public void ShowContact() {
        System.out.println("============ List Contact ============");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("======================================");
        }
    }

    // 5. Phương thức tìm kiếm danh bạ
    public void FindContact(String name) {
        System.out.println("========== Find Result =========");
        for (Contact contact : contacts) {
            if (contact.getName().contains(name)) {
                System.out.println("Name: " + contact.getName());
                System.out.println("Phone number: " + contact.getPhoneNumber());
                System.out.println("================================");
            }
        }
    }
}
