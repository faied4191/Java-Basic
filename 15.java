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

        // Method to calculate and display the perimeter
        void perimeter() {
            int perimeter = 2 * (length + width);
            System.out.println("Perimeter: " + perimeter);
        }
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle ob = new Rectangle(5, 3);

        // Display the area and perimeter
        ob.area();
        ob.perimeter();
    }
}