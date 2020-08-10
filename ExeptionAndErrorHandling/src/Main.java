
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Person georgi = new Person("Georgi", "Petrov", 22);
            Person ivan = new Person(" ", "Petrov", 25);
            Person mario = new Person("Mario", "Hulka", 122);
            Person niki = new Person("Niki", "   ", 25);
            Person dave = new Person(null, "President", 52);
        } catch (IllegalArgumentException ex) {
            System.out.println("Exception thrown: " + ex.getMessage());
        }
    }
}
