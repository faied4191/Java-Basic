public class Main {

    // Define the Animal class
    static class Animal {
        // Method for eating
        void eat() {
            System.out.println("Eat");
        }

        // Method for sleeping
        void sleep() {
            System.out.println("Sleep");
        }
    }

    // Define the Dog class which extends Animal
    static class Dog extends Animal {
        // Method for barking
        void bark() {
            System.out.println("Woof!");
        }
    }

    public static void main(String[] args) {
        // Create a Dog object
        Dog ob = new Dog();

        // Call methods from Animal class
        ob.eat();
        ob.sleep();

        // Call method from Dog class
        ob.bark();
    }
}