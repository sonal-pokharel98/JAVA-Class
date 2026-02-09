class Calci {

    // Addition (overloaded)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    int sub(int a, int b) {
        return a - b;
    }

    // Multiplication
    int mul(int a, int b) {
        return a * b;
    }

    // Division
    double div(double a, double b) {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calci calc = new Calci();

        System.out.println("Addition: " + calc.add(5, 10));
        System.out.println("Addition: " + calc.add(5.5, 2.2));
        System.out.println("Subtraction: " + calc.sub(10, 3));
        System.out.println("Multiplication: " + calc.mul(4, 5));
        System.out.println("Division: " + calc.div(10, 4));
    }
}
