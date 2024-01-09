package Management;

import java.util.Scanner;

public class Contact {
    private String Name;
    private String PhoneNumber;

    public Contact(){}
    // Phương thức khởi tạo để nhập dữ liệu cho thuộc tính
    public Contact(String name, String phoneNumber) {
        Name = name;
        PhoneNumber = phoneNumber;
    }

    // Phương thức get
    public String getName() {
        return Name;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    // Phương thức set
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    // Input contact information
    public static Contact createContactFromUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Phone Number: ");
        String phonenumber = input.nextLine();
        return new Contact(name, phonenumber);
    }
}
