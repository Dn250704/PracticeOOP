package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Định nghĩa anntation
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationSimple {
    String value();
}

@MyAnnotationSimple("This is applied to the class")
class Mix2 {
    @MyAnnotationSimple("This is applied to the method")
    public void MyMethod() {
        // Anything content
    }
    @MyAnnotationSimple("This is applied to the field")
    private int myField;
}

class CheckEx8 {
    public static void main(String[] args) {
        // Kiểm tra xem các phần tử có sử dụng annotation không
        Mix2 object = new Mix2();

        // Kiểm tra lớp
        if (Mix2.class.isAnnotationPresent(MyAnnotationSimple.class)) {
            MyAnnotationSimple myAnnotationSimple = Mix2.class.getAnnotation(MyAnnotationSimple.class);
            System.out.println("Class Annotation: " + myAnnotationSimple.value());
        }

        // Kiểm tra phương thức
        try {
            if (Mix2.class.getMethod("MyMethod").isAnnotationPresent(MyAnnotationSimple.class)) {
                MyAnnotationSimple method = Mix2.class.getMethod("MyMethod").getAnnotation(MyAnnotationSimple.class);
                System.out.println("Method Annotation: " + method.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        // Kiểm tra trường
        try {
            if (Mix2.class.getDeclaredField("myField").isAnnotationPresent(MyAnnotationSimple.class)) {
                MyAnnotationSimple field = Mix2.class.getDeclaredField("myField").getAnnotation(MyAnnotationSimple.class);
                System.out.println("Field Annotation: " + field.value());
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}