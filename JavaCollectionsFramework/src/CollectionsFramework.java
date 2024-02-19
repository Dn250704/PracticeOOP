// Java code to illustrate initialization
// of ArrayList using add() method
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsFramework {


    // Shorthand declare
    public void Ar() {
        // Create a ArrayList String type
        ArrayList<String> gfg = new ArrayList<String>() {
            {
                // Initialize an ArrayList with add()
                add("Geeks");
                add("for");
                add("Geeks");
            }
        };
        System.out.println(gfg);
    }

    // Initialization using asList()
    // Syntax: ArrayList(Type) obj = new ArrayList<Type>(
    // Arrays.asList(Obj A, Obj B, Obj C,... so on));
    public void AR() {
        // Create a ArrayList Integer type
        // and Initialize an ArrayList with asList()
        ArrayList<Integer> ar = new ArrayList<Integer>(
                Arrays.asList(1,2,3)
        );
        System.out.println(ar + " //asList");
    }

    // Initialization using List.of() method
    // Syntax: List<Type> obj = new ArrayList<Type> (
    // List.of(Obj A, Obj B, Obj C... so on));
    public void Lsof() {
        // Create a ArrayList Integer type
        // and Initialize an ArrayList with List.of()
        List<Integer> ls = new ArrayList<>(
                List.of(1,2,3)
        );
        System.out.println(ls + " //List.of()");
    }

    // Initialization using another Collection
    // Syntax: List var = new ArrayList(collection)
    public void uaC() {
        //Create another collection
        List<Integer> var = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        List<Integer> var1 = new ArrayList<>(var);
        System.out.println(var1 + " //Using another collection");
    }

    // Initialization using stream() and collect() methods
    // Syntax: ArrayList(Type) listName = Stream.of(element1, element2, ...,
    // elementN).collect(Collectors.toCollection(ArrayList::new));
    public void SC() {
        ArrayList<String> list = Stream.of("Geeks", "For", "Geeks").collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list + " //using stream() and collect() method");
    }
    public static void main(String args[])
    {

        // create a ArrayList String type
        // and Initialize an ArrayList with add()

        CollectionsFramework a = new CollectionsFramework();
        // print ArrayList
        System.out.println("ArrayList : ");
        a.Ar();
        a.AR();
        a.Lsof();
        a.uaC();
        a.SC();
    }
}
