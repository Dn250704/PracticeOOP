import java.util.ArrayList;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the numbers of element: ");
        int element = new Scanner(System.in).nextInt();
        for (int i = 0; i < element; i++) {
            System.out.print("a[" + i + "] =");
            int number = new Scanner(System.in).nextInt();
            list.add(number);
        }
    }
}