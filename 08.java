import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String a = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            count++;
        }

        System.out.println("Name: " + a);
        System.out.println("Length: " + count);

        scanner.close();
    }
}