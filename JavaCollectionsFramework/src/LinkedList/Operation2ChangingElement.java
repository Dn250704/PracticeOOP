package LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class Operation2ChangingElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String >() {
            {
                add("Nguyen");
                add("Dung");
                add(1, "Quang");
            }
        };
        System.out.println("LinkedList: " + ll);

        ll.set(1, "Quang");
        System.out.println("LinkedList updated: " + ll);

        Object[] arr = ll.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for (Object element : arr) {
            System.out.print(element + " ");
        }
    }
}
// LinkedList: [Nguyen, Quang, Dung]
// LinkedList updated: [Nguyen, Quang, Dung]
// After converted LinkedList to Array: Nguyen Quang Dung