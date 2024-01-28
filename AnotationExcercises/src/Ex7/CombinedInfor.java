package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CombinedInfor {
    String description() default "No description";
}

@CombinedInfor(description = "This is a combined annotation")
class Mix {
    @CombinedInfor(description = "This is a combined method")
    public void MyMethod() {
        System.out.println("This is a method");
    }
}

class CheckEx5 {
    public static void main(String[] args) {
        // Kiểm tra xem lớp có sử dụng annotation không
        if (Mix.class.isAnnotationPresent(CombinedInfor.class)) {
            CombinedInfor classInfor = Mix.class.getAnnotation(CombinedInfor.class);
            System.out.println("Class description: " + classInfor.description());
        } else {
            System.out.println("Không có annotation CombinedInfor cho lớp Mix");
        }

        // Kiểm tra xem phương thức có sử dụng annotation không
        try {
            Method method = Mix.class.getMethod("MyMethod");
            if (method.isAnnotationPresent(CombinedInfor.class)) {
                CombinedInfor methodInfor = Mix.class.getAnnotation(CombinedInfor.class);
                System.out.println("Method description: " + methodInfor.description());
            } else {
                System.out.println("Không có annotation CombinedInfor cho phương thức MyMethod");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
