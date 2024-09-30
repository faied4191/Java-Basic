import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int a = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        String[] arr1 = new String[a];