package LinkedList;
// Java Program to Demonstrate
// Import required classes
import java.util.LinkedList;

public class Demonstrate {
    // Driver code
    public static void main(String[] args) {
        // Creating object of the class linked list
        LinkedList<String> ll = new LinkedList<String >();
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        System.out.println("LinkedList has " + ll + " element!");

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("LinkedList has " + ll + " element after removed!");
    }
}
