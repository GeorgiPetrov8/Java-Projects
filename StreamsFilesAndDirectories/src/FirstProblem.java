import java.io.File;

public class FirstProblem {
    public static void main(String[] args) {

        File file = new File("Files-and-Streams");


        File[] fileList = file.listFiles();
        int count = 1;
        if (fileList != null) {
            System.out.println(file.getName());
            for (File f : fileList) {
                if (f.isDirectory()) {
                    System.out.println(f.getName());
                    count++;
                    File[] inF =f.listFiles();
                    for (File f1 : inF) {
                        if (f1.isDirectory()) {
                            System.out.println(f1.getName());
                            count++;
                           File[] inF2 = f1.listFiles();
                            for (File f2 : inF2) {
                                if (f2.isDirectory()) {
                                    System.out.println(f2.getName());
                                    count++;
                                   File[] inF3 = f2.listFiles();
                                    for (File f3 : inF3) {
                                        if (f3.isDirectory()) {
                                            System.out.println(f3.getName());
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }

            System.out.printf("%d folders%n", count);
        }

    }
}
