public class Main {

    // Method to add two integers
    static void add(int a, int b) {
        System.out.println("The Sum is: " + (a + b));
    }

    // Method to add two doubles
    static void add(double a, double b) {
        System.out.println("The Sum is: " + (a + b));
    }

    // Method to add three integers
    static void add(int a, int b, int c) {
        System.out.println("The Sum is: " + (a + b + c));
    }

    public static void main(String[] args) {
        // Call overloaded methods
        add(5, 3);         // Calls the method with two integers
        add(2.5, 1.8);     // Calls the method with two doubles
        add(1, 2, 3);      // Calls the method with three integers
    }
}