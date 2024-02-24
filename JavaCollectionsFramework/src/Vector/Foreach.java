package Vector;

import java.util.*;

public class Foreach extends Vector {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>() {
            {
                add("Hii");
                add("Loo");
                add("Co");
                add("Ba");
            }
        };
        ar.forEach((n) -> System.out.println(n));

        // Declare list iterator
        ListIterator listitr = ar.listIterator();

        // If you need stard at the specified position in list, you can use:
        ListIterator listitrs = ar.listIterator(1);
        // Forward iterations
        System.out.println("\nForward Traversal: ");
        while (listitr.hasNext()) {
            System.out.println(listitr.next());
        }

        // Backward iterations
        System.out.println("\nBackward Traversal:");
        while (listitr.hasPrevious()) {
            System.out.println(listitr.previous());
        }


        Vector<Integer> vt = new Vector<>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        // Remove If
        vt.removeIf(n-> (n % 2 == 0));
        System.out.println("\nAll number not divisible by 2 are: ");
        for (int a : vt) {
            System.out.println(a + " ");
        }

        Foreach vector = new Foreach() {
            {
                add("Geeks");
                add("for");
                add("Geeks");
                add("Mazda");
                add("Honda");
                add("Hiii");
            }
        };
        // Vector before deleting
        System.out.println("\nVector before calling removeRange(1,3): " + vector);

        // removeRange(fromIndex, toIndex)
        vector.removeRange(1,3);

        // Vector after removeRange called
        System.out.println("Vector after calling removeRange(1,3): " + vector);

        // replaceAll() replace all element Hiii with Motobike
        Collections.replaceAll(vector, "Hiii", "Motobike");
        System.out.println("\nAfter replace: " + vector);
    }
}
