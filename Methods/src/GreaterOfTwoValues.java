import java.util.Scanner;

public class GreaterOfTwoValues {

   private static int getMax (int firstNum , int secondNum) {
       if (firstNum > secondNum) {
           return firstNum;
       }
       return secondNum;
   }
   private static char getMax (char first , char second) {
       if (first > second) {
           return first;
       }
       return second;
   }
    private static String getMax (String fist , String second) {
        if (fist.compareTo(second) >= 0) {
            return fist;
        }
        return second;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       String type = scan.nextLine();
       if (type.equals("int")) {
           int firstNum = Integer.parseInt(scan.nextLine());
           int secondNum = Integer.parseInt(scan.nextLine());
           System.out.println(getMax(firstNum,secondNum));
       } else if (type.equals("char")) {
           char first = scan.nextLine().charAt(0);
           char second = scan.nextLine().charAt(0);
           System.out.println(getMax(first,second));
       } else if (type.equals("string")) {
           String first = scan.nextLine();
           String second = scan.nextLine();
           System.out.println(getMax(first,second));
       }


    }
}
