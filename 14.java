public class Main {

    // Define the Book class
    static class Book {
        String title;
        String author;
        int year;

        // Constructor
        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        // Method to display book details
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Year: " + year);
        }
    }

    public static void main(String[] args) {
        // Create Book objects
        Book ob1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book ob2 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979);

        // Display book details
        ob1.display();
        ob2.display();
    }
}