import java.util.Scanner;

public class Main {
    // Method to calculate the sum of two numbers
    public static float isSum(float x, float y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = scanner.nextFloat();

        System.out.print("Enter the second number: ");
        float b = scanner.nextFloat();

        float sum = isSum(a, b);

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}