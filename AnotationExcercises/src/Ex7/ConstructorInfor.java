package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;

// Định nghĩa annotation
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConstructorInfor {
    String description() default "I have no idea";
}

// Sử dụng annotation trên 1 constructor
class MyConstructor {
    @ConstructorInfor(description = "This is my constructor")
    public MyConstructor() {
        System.out.println("Constructor is no parameter");
    }
}

class CheckEx4 {
    public static void main(String[] args) {
        // Kiểm tra xem constructor có sử dụng annotation không
        try {
            Constructor <?> constructor = MyConstructor.class.getConstructor();
            if (constructor.isAnnotationPresent(ConstructorInfor.class)) {
                ConstructorInfor constructorInfor = constructor.getAnnotation(ConstructorInfor.class);
                System.out.println("Description: " + constructorInfor.description());
            } else {
                System.out.println("Không có annotation ConstructorInfor cho constructor của lớp MyConstructor");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}