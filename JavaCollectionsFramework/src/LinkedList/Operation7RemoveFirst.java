package LinkedList;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operation7RemoveFirst {
    public static void main(String[] args) {
        ArrayList<String> arr = Stream.of("Nguyen", "Quang", "Dung").collect(Collectors.toCollection(ArrayList::new));
        System.out.println("ArrayList: " + arr);
        arr.remove(0);
        System.out.println("The remove first element is: " + arr);
    }
}
