import java.util.Scanner;

public class Main {
    // Method to calculate the sum of two numbers
    public static float isSum(float x, float y) {
        return x + y;
    }

    // Method to find the maximum of two numbers
    public static float isMax(float x, float y) {
        return (x > y) ? x : y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float b = scanner.nextFloat();

        float sum = isSum(a, b);
        float max = isMax(a, b);

        System.out.println("The sum is: " + sum);
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}