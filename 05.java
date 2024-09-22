import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();

        System.out.print("Enter Third Number: ");
        int c = scanner.nextInt();

        int greatest;

        if (a > b && a > c) {
            greatest = a;
        } else if (b > a && b > c) {
            greatest = b;
        } else {
            greatest = c;
        }

        System.out.println("The Greatest is: " + greatest);

        scanner.close();
    }
}