import java.io.*;
public class HomeWork {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("index.jpg");
        FileOutputStream out = new FileOutputStream("out.jpg");

        byte[] buffer = new byte[1024];

        int read = 0;
        int count = 0;
        while ((read = file.read(buffer)) > 0) {
            out.write(buffer,0,read);
            count++;
        }
        System.out.println(count);


    }
}
