// Example of Creating, applying and accessing annotation.
import java.lang.annotation.*;
import java.lang.reflect.*;
// Creating annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    int value();
}

// Applying annotation
class Hello {
    @MyAnnotation(value = 10)
    public void sayHello() {
        System.out.println("Hello Annotation");
    }
}

// Accessing annotation
public class Ex5 {
    public static void main(String[] args) throws Exception {
        Hello hi = new Hello();
        Method method = hi.getClass().getMethod("sayHello");
        MyAnnotation myanno = method.getAnnotation(MyAnnotation.class);
        System.out.println("Value is: " + myanno);
    }
}
