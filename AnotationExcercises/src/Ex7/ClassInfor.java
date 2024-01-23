package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Định nghĩa annotation và chỉ định loại phần tử mà nó có thể áp dụng
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfor {
    String author();
    String version() default "1.0";
}

// Sử dụng annotation trên 1 lớp
@ClassInfor(author = "Mr Juner", version = "4.0")
class MyClass {
    // Nếu có nội dung
}
class Main {
    public static void main(String[] args) {
        // Kiểm tra xem lớp có sử dụng annotation không
        if (MyClass.class.isAnnotationPresent(ClassInfor.class)) {
            ClassInfor classInfor = MyClass.class.getAnnotation(ClassInfor.class);
            System.out.println("Author: " + classInfor.author());
            System.out.println("Version: " + classInfor.version());
        } else {
            System.out.println("Không có annotation ClassInfor cho lớp MyClass");
        }
    }
}
