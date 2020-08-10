import java.util.Scanner;

public class ExtractFiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        int nameIndex = text.lastIndexOf('\\');
        int endAndStart = text.lastIndexOf('.');

        String name = text.substring(nameIndex + 1, endAndStart );
        String ext = text.substring(endAndStart + 1);

        System.out.println(String.format("File name: %s", name));
        System.out.println(String.format("File extension: %s",ext));


    }
}
