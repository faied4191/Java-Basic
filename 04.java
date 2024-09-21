import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hour of the Day: ");
        int a = scanner.nextInt();

        if (a < 10) {
            System.out.println("Good morning");
        } else if (a < 20) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        scanner.close();
    }
}