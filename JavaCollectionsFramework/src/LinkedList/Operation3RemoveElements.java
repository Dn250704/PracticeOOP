package LinkedList;

import java.util.LinkedList;

public class Operation3RemoveElements {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>() {
            {
                add("Geeks");
                add("Geeks");
                add(1, "For");
            }
        };
        System.out.println("Initial LinkedList: " + ll);

        // Function remove call
        ll.remove(1);
        System.out.println("After the Index Removal: " + ll);

        ll.remove("Geeks");
        System.out.println("After the Object Removal: " + ll);
    }
}
// Initial LinkedList: [Geeks, For, Geeks]
// After the Index Removal: [Geeks, Geeks]
// After the Object Removal: [Geeks]