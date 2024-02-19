package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operation6Size {
    public static void main(String[] args) {
        // Declare and using stream() and collect() method
        ArrayList<String> ll = Stream.of("Nguyen", "Quang", "Dung").collect(Collectors.toCollection(ArrayList::new));
        System.out.println("ArrayList: " + ll);

        int size = ll.size();
        System.out.println("The size of the ArrayList is: " + size);
    }
}
// ArrayList: [Nguyen, Quang, Dung]
// The size of the ArrayList is: 3