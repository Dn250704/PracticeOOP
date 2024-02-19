package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Operation4Iterating {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Nguyen");
        ll.add("Quang");
        ll.add("Dung");
        ArrayList<String> arr = new ArrayList<String>(
                Arrays.asList("Nguyen", "Quang", "Dung")
        );
        System.out.println(arr);

        // For-loop
        System.out.print("For-Loop: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.print("For-Each: ");
        // For-each
        for (String ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
// [Nguyen, Quang, Dung]
// For-Loop: Nguyen Quang Dung
// For-Each: Nguyen Quang Dung