package Ex7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ParameterInfor {
    String decription() default "I have no idea";
}

class MyParameter {
    public void MyMethod(@ParameterInfor(decription = "This is my opinion") String parameter) {
        // Nội dung phương thức
    }
}

class Ex3 {
    public static void main(String[] args) {
        // Kiểm tra xem tham số của phương thức có sử dụng annotation không
        try {
            MyParameter myParameter = new MyParameter();
            Method method = MyParameter.class.getMethod("MyMethod", String.class);
            Parameter parameter = method.getParameters()[0];
            if(parameter.isAnnotationPresent(ParameterInfor.class)) {
                ParameterInfor parameterInfor = parameter.getAnnotation(ParameterInfor.class);
                System.out.println("Description: " + parameterInfor.decription());
            } else {
                System.out.println("Không có annotation ParameterInfor cho tham số của phương thức MyMethod");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}