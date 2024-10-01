public class Main {

    // Define the Adder class
    static class Adder {
        // Hidden data from the outside world
        private int total;

        // Constructor with default value
        Adder(int i) {
            total = i;
        }

        // Default constructor
        Adder() {
            this(0); // Calls the parameterized constructor with default value 0
        }

        // Interface to add a number
        void addNum(int number) {
            total += number;
        }

        // Interface to get the total
        int getTotal() {
            return total;
        }
    }

    public static void main(String[] args) {
        // Create an Adder object
        Adder a = new Adder();