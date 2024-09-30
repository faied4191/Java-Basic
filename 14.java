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