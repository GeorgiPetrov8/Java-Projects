import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//banana, apple, kiwi, cherry, lemon и grapes  ?tomato, cucumber, pepper и carrot

        String food = scan.nextLine();
        if (food.equals("banana") || food.equals("apple") || food.equals("kiwi") || food.equals("cherry") || food.equals("lemon")
         || food.equals("grapes")) {
            System.out.println("fruit");
        } else if (food.equals("tomato") || food.equals("cucumber") || food.equals("pepper") || food.equals("carrot")) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}
