public class Calculator {
    public static int add(int a, int b) { return a + b+1; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division by zero");
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Résultat : " + add(4, 2));
    }
}