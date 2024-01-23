import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex6 {

    // Upper Bounded Wildcard
    private static Double add(ArrayList<? extends Number> num) {
        double sum = 0.0;
        for (Number n : num) {
            sum = sum + n.doubleValue();
        }
        return sum;
    }

    // Unbounded Wildcards
    public static void display(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(20);
        System.out.println("Displaying the sum: " + add(l1));

        ArrayList<Double> l2 = new ArrayList<Double>();
        l2.add(30.0);
        l2.add(40.0);
        System.out.println("Displaying the sum: " + add(l2));

        List<Integer> l3 = Arrays.asList(1,2,3);
        System.out.println("Displaying the Integer values: ");
        display(l3);

        List<String> l4 = Arrays.asList("One", "Two", "Three");
        System.out.println("Displaying the String values: ");
        display(l4);

        LowerBoundWildcard lower = new LowerBoundWildcard();
        List<Integer> l5 = Arrays.asList(1,2,3);
        System.out.println("Displaying the Integer values: ");
        lower.addNumbers(l5);

        List<Number> l6 = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("Displaying the Number values: ");
        lower.addNumbers(l6);
    }
}
class LowerBoundWildcard {
    public static void addNumbers(List<? super Integer> list) {
        for (Object n : list) {
            System.out.println(n);
        }
    }
}