public class Main {
    public static void main(String[] args) {
        String[] arr1 = {"Volvo", "BMW", "Ford", "Mazda"};
        arr1[0] = "Opel";

        System.out.println("First Element Name: " + arr1[0]);
        System.out.println("First Element Length: " + arr1[0].length());
        System.out.println("Array Size: " + arr1.length);
    }
}