package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfor {
    String author();
    String version() default "1.0";
}

class CheckAnnotation {
    @MethodInfor(author = "Nguyen Quang Dung", version = "4.0")
    public void myMethod() {
        // Nội dung của phương thức
        System.out.println("Executing myMethod");
    }
}

class CheckEx1 {
    public static void main(String[] args) {
        // Kiểm tra xem phương thức có sử dụng annotation hay không
        try {
            Method method = CheckAnnotation.class.getMethod("myMethod");
            if (method.isAnnotationPresent(MethodInfor.class)) {
                MethodInfor methodInfor = method.getAnnotation(MethodInfor.class);
                System.out.println("Author: " + methodInfor.author());
                System.out.println("Version: "+ methodInfor.version());
            } else {
                System.out.println("Không có annotation MethodInfor cho lớp CheckAnnotation");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
