public class Main {

    // Define the Calculator class
    static class Calculator {

        // Method to add two integers
        void add(int a, int b) {
            System.out.println("The Sum is: " + (a + b));
        }

        // Method to add two doubles
        void add(double a, double b) {
            System.out.println("The Sum is: " + (a + b));
        }

        // Method to add three integers
        void add(int a, int b, int c) {
            System.out.println("The Sum is: " + (a + b + c));
        }
    }

    public static void main(String[] args) {
        // Create a Calculator object
        Calculator ob = new Calculator();

        // Call overloaded methods
        ob.add(5, 3);         // Calls the method with two integers
        ob.add(2.5, 1.8);     // Calls the method with two doubles
        ob.add(1, 2, 3);      // Calls the method with three integers
    }
}