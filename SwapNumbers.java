// Problem: Write a function that swaps two numbers without using a third variable.
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to swap:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}
