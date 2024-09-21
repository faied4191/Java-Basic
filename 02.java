import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String a = scanner.nextLine();

        System.out.print("Enter Your ID: ");
        String b = scanner.nextLine();

        System.out.println("Name: " + a);
        System.out.println("ID: " + b);
        System.out.println("Length of Name= " + a.length());

        scanner.close();
    }
}