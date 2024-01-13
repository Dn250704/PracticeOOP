public class Ex1 {

    // The method has been marked as @Deprecrated
    @Deprecated
    public void deprecratedMethod() {
        System.out.println("This method is deprecrated.");
    }

    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        // Used method has been marked as @Deprecrated
        ex.deprecratedMethod();

        // If you used method, Warnming: 'deprecratedMethod' is deprecrated.

    }
}
