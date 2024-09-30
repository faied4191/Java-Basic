public class Main {

    // Define the Rectangle class
    static class Rectangle {
        int length;
        int width;

        // Constructor
        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        // Method to calculate and display the area
        void area() {
            int area = length * width;
            System.out.println("Area: " + area);
        }