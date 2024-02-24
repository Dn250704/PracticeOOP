package Vector;

import java.util.Scanner;
import java.util.Vector;

public class Operation1AddElement extends Vector{
    public static void main(String[] args) {
        Operation1AddElement vector = new Operation1AddElement();
        // Adding elements
        System.out.print("Nhập họ: ");
        String ho = new Scanner(System.in).nextLine();
        vector.add(ho);
        System.out.print("Nhập họ đệm: ");
        String hodem = new Scanner(System.in).nextLine();
        vector.add(hodem);
        System.out.print("Nhập tên: ");
        String ten = new Scanner(System.in).nextLine();
        vector.add(ten);
        System.out.println(vector);

        // Updating elements
        System.out.print("Nhập tên muốn thay đổi: ");
        String tenmoi = new Scanner(System.in).nextLine();
        vector.set(2, tenmoi);
        System.out.println("Tên sau khi thay đổi: " + vector.get(2));

        // Removing elements
        System.out.println("Nhập tên muốn xoá: ");
        String tenxoa = new Scanner(System.in).nextLine();
        vector.removeIf(n-> (n== tenxoa));
        System.out.println("Tên sau khi xoá: " + vector);
    }
}
