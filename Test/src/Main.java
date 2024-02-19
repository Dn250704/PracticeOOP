import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner a = new Scanner(System.in);
        System.out.println("Nhập tên mùa trong tiếng anh: ");
        String season = new Scanner(System.in).nextLine().trim().toLowerCase();
        String st = switch (season) {
            case "1" -> "Mu xuân";
            case "2" -> "s";
            default -> throw new IllegalStateException("Unexpected value: " + season);
        };
        System.out.println(st);
    }
}