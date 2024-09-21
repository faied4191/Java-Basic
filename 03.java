import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        float a = scanner.nextFloat();

        System.out.print("Enter Second Number: ");
        float b = scanner.nextFloat();

        float sum = a + b;

        System.out.println("The Sum is: " + sum);

        scanner.close();
    }
}