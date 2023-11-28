public class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.err.println("undefined: division by zero");
            return 0;
        }
        return a / b;
    }
}
