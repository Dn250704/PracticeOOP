class Superclass {
    void a() {
        System.out.println("Class bố");
    }
}
class ChilClass extends Superclass {
    @Override
    void a() {
        System.out.println("Class con");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        ChilClass chilClass = new ChilClass();
        chilClass.a();
        
    }
}
