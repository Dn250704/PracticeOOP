package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Định nghĩa annotation
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String author() default "Nguyễn Quang Dũng";
    String date();
    String description() default "No description";
}

// Sử dụng annotation trên các phần tử khác nhau
@CustomAnnotation(author = "Mr Juner", date = "25/07/2004", description = "Harry Potter")
class myClass {
    @CustomAnnotation(date = "Jan 28, 2024", author = "Mr Juner", description = "Harry Potter")
    public void myMethod() {}

    @CustomAnnotation(description = "Harry Potter", date = "28/01/2024", author = "Mr Juner")
    private String myField;
}

class CheckEx9 {
    public static void main(String[] args) {
        // Lây thông tin từ annotation của lớp
        CustomAnnotation customAnnotation = myClass.class.getAnnotation(CustomAnnotation.class);
        System.out.println("------Class Annotation------");
        System.out.println("Author: " + customAnnotation.author());
        System.out.println("Date: " + customAnnotation.date());
        System.out.println("Description: " + customAnnotation.description());

        System.out.println("----------------------------");

        try {
            // Lấy thông tin từ annotationo của phương thức
            CustomAnnotation customAnnotation1 = myClass.class.getMethod("myMethod").getAnnotation(CustomAnnotation.class);
            System.out.println("------Method Annotation------");
            System.out.println("Date: " + customAnnotation1.date());
            System.out.println("Author: " + customAnnotation1.author());
            System.out.println("Description: " + customAnnotation1.description());

            System.out.println("----------------------------");

            // Lấy thông tin tử annotation của field
            CustomAnnotation customAnnotation2 = myClass.class.getDeclaredField("myField").getAnnotation(CustomAnnotation.class);
            System.out.println("------Field Annotation-------");
            System.out.println("Description: " + customAnnotation2.description());
            System.out.println("Date: " + customAnnotation2.date());
            System.out.println("Author: " + customAnnotation2.author());
        } catch (NoSuchMethodException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}