import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;

    // Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor
    public Book() {
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }



}
class ManagerBook {
    Book book = new Book();
    private final ArrayList<Book> booklist;

    ManagerBook() {
        this.booklist = new ArrayList<>();
    }

    public void Menu() {
        System.out.println("============= MENU =============");
        System.out.println("1. Input book information");
        System.out.println("2. Remove book information with book name");
        System.out.println("3. Show list of book");
        System.out.println("4. Input a book need to find");
        System.out.println("================================");
    }
    public boolean CheckExist(String title) {
        for (Book book : booklist) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean CheckSize() {
        if (booklist.isEmpty()) {
            return true;
        }
        return false;
    }
    public void Input() {
        System.out.print("Enter tilte: ");
        String title = new Scanner(System.in).nextLine();
        System.out.print("Enter author: ");
        String author = new Scanner(System.in).nextLine();
        System.out.print("Enter price: ");
        double price = new Scanner(System.in).nextDouble();
        if (!CheckExist(title)) {
            booklist.add(new Book(title, author, price));
            System.out.println("Added book name" + title);
        } else {
            System.out.println("Book " + title + " is existing!");
        }
    }

    public void Showdisplay() {
        for (Book book : booklist) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("================================");
        }
    }

    public void RemoveBook(String title) {
        try {
            if (CheckSize()) {
                System.out.println("No books is existing!");
            }
            for (Book book : booklist) {
                if (book.getTitle().equals(title)) {
                    booklist.remove(book);
                    System.out.println("Removed book " + title);
                }
            }
        } catch (Exception e) {
                System.out.println("No books is existing!");
        }
    }
     public void FindBook(String index) {
         for (Book book : booklist) {
             if (book.getTitle().contains(index)) {
                 System.out.println("Title: " + book.getTitle());
                 System.out.println("Author: " + book.getAuthor());
                 System.out.println("Price: " + book.getPrice());
                 System.out.println("================================");
             }
         }
             System.out.println("Not found this book!");
     }

    public static void main(String[] args) {
        ManagerBook mb = new ManagerBook();
        while (true) {
            mb.Menu();
            System.out.print("Enter your choose: ");
            int choose = new Scanner(System.in).nextInt();
            System.out.println("================================");
            switch (choose) {
                case 1:
                    mb.Input();
                    break;
                case 2:
                    if (mb.CheckSize()) {
                        System.out.println("No books is existing!");
                    }
                    System.out.print("Enter book need to remove: ");
                    String title = new Scanner(System.in).nextLine();
                    mb.RemoveBook(title);
                    break;
                case 3:
                    if (mb.CheckSize()) {
                        System.out.println("No books is existing!");
                    } else {
                        System.out.println("======= Book Information =======");
                        mb.Showdisplay();
                    }
                    break;
                case 4:
                    System.out.print("Enter book need to find: ");
                    String index = new Scanner(System.in).nextLine();
                    System.out.println("================================");
                    mb.FindBook(index);

            }
        }
    }
}