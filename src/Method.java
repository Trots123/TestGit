public class Method {
    public static void main(String[] args) {
        cube(3);
        cube(3, 3);
        multiplySymbol(5);
        multiplySymbol(10, "&");

    }

    public static void cube(int value) {
        int result = 1;
        for (int i = 1; i <= 3; i++) {
            result = result * value;
        }
        System.out.println(result);
    }

    public static void cube(double value, double power) {
        double result = Math.pow(value,power);
        System.out.println(result);
    }

    public static void multiplySymbol(int iterations) {
        for (int i=0; i!=iterations; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }

    public static void multiplySymbol(int iterations, String symbol) {
        for (int i=0; i!=iterations; i++) {
            System.out.print(symbol);
        }
        System.out.println("\n");
    }
}
