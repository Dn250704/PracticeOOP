package LinkedList;
import java.util.LinkedList;
public class Operation1AddElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String >() {
            {
                add("Geeks");
                add("Geeks");
                add(1, "For");
            }
        };
        System.out.println("LinkedList: " + ll);
    }
}
// [Geeks, For, Geeks]