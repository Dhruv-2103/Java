class Calculator {
    public int addfunc(int a, int b) {
        return a + b;
    }

    public double addfunc(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int intResult = calc.addfunc(5, 10); 
        double doubleResult = calc.addfunc(5.5, 10.5);

        System.out.println("Addition of integers: " + intResult);
        System.out.println("Addition of doubles: " + doubleResult);
    }
}
