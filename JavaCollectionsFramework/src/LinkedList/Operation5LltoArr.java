package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Operation5LltoArr {
    public static void main(String[] args) {
        List<String> ll = new ArrayList<>(
                List.of("Nguyen", "Quang", "Dung")
        );
        System.out.println("LinkedList: " + ll);
        Object[] arr = ll.toArray();

        System.out.print("After converted LinkedList to Array: ");
        for (Object ar : arr) {
            System.out.print(ar + " ");
        }
    }
}
// LinkedList: [Nguyen, Quang, Dung]
// After converted LinkedList to Array: Nguyen Quang Dung