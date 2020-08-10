import java.util.*;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] enter = scan.nextLine().split("&");

        List<String> books = new ArrayList<>(Arrays.asList(enter));

        String input;
        while (!"Done".equals(input = scan.nextLine())) {
            String[] tokens = input.split(" \\| ");

            String command = tokens[0];
            switch (command) {
                case "Add Book":
                    String nameBook = tokens[1];
                    if (!books.contains(nameBook)) {
                        books.add(0, nameBook);
                    }
                    break;
                case "Take Book":
                    String nameBook1 = tokens[1];
                    if (!books.contains(nameBook1)) {
                        continue;
                    } else {
                        books.remove(nameBook1);
                    }
                    break;
                case "Swap Books":
                    String firstBook = tokens[1];
                    String secondBook = tokens[2];
                    int indexOfTheFirstBook = books.indexOf(tokens[1]);
                    int indexOfTheSecondBook = books.indexOf(tokens[2]);
                    if (books.contains(firstBook) && books.contains(secondBook)) {
                        Collections.swap(books, indexOfTheFirstBook, indexOfTheSecondBook);
                    }
                    break;
                case "Insert Book":
                    String bookName = tokens[1];
                    books.add(bookName);
                    break;
                case "Check Book":
                    int index = Integer.parseInt(tokens[1]);

                    if (index < 0 || index > books.size()) {
                        continue;
                    } else {
                        String checkedBook = books.get(index);
                        System.out.println(checkedBook);
                    }
            }
        }
        System.out.println(String.join(", ", books));
    }
}
