public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of the elements: " + sum);
    }
}