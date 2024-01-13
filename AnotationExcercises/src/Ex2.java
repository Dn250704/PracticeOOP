import jdk.jfr.Relational;

import java.lang.annotation.*;

// Tạo một custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@interface CustomAnnotation {
    String value() default "Default Value";
}

// Áp dụng anotation cho 1 class và 1 phương thức
// @CustomAnnotation("Class Level Annotation")
public class Ex2 {
    @CustomAnnotation("Method Level Annotation")
    public void annotatedMethod() {
        System.out.println("This method has a custom annotation!");
    }
    public static void main(String[] args) {
        // Kiểm tra và hiển thị thông tin của annotation cho class
        Class<?> annotationClass = Ex2.class;
        if (annotationClass.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation customAnnotation = annotationClass.getAnnotation(CustomAnnotation.class);
            System.out.println("Class Annotation Value: " + customAnnotation.value());
        }

        // Kiểm tra và hiển thị thông tin của annotation cho phương thức
        try {
            Ex2 ex = new Ex2();
            Class<?> annotatedMethodClass = ex.getClass();
            java.lang.reflect.Method method = annotatedMethodClass.getMethod("annotatedMethod");

            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation methodAnnotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println("Method Annotation Value: " + methodAnnotation.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
