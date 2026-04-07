public class ThrowExample {

    public static void fun() throws Exception {
        int n1 = 10;
        int n2 = 0;

        if (n2 == 0) {
            throw new Exception("Cannot divide by zero!");
        }
        int r = n1 / n2;
        System.out.println(r);
    }

    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}