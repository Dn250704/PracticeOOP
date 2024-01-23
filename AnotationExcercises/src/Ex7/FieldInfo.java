package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldInfo {
    String describe() default "I have no idea";
}

// Sử dụng annotation trên field
class MyClassField {
    @FieldInfo(describe = "This is a sample field")
    private String sampleField;
    // Nội dung của lớp
}

class CheckEx2 {
    public static void main(String[] args) {
        try {
            MyClassField myObject = new MyClassField();
            Field field = MyClassField.class.getDeclaredField("sampleField");
            if (field.isAnnotationPresent(FieldInfo.class)) {
                // Lấy thông tin từ annotation
                FieldInfo fieldInfo = field.getAnnotation(FieldInfo.class);
                System.out.println("Describe: " + fieldInfo.describe());
            } else {
                System.out.println("Không có annotation FieldInfo cho trường sampleField");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}