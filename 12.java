import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int a = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        String[] arr1 = new String[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Enter element name " + (i + 1) + ": ");
            arr1[i] = scanner.nextLine();
        }

        System.out.println("First Element Name: " + arr1[0]);
        System.out.println("First Element Length: " + arr1[0].length());
        System.out.println("Array Size: " + arr1.length);

        scanner.close();
    }
}