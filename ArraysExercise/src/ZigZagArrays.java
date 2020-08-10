import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());// vuvejdame 4
        String[] firstArr = new String[n];//duljina na masiva e 4
        String[] secondArr= new String[n];//duljina na masiva e 4
        for (int i = 0; i <n ; i++) {
            String[] currentArr = scan.nextLine().split(" ");//direktno chetem
            if (i % 2 ==0) { //i= 0 , 2
                firstArr[i]=currentArr[0];// na 0 idva purvoto chislo;
                secondArr[i]=currentArr[1];// na 0 idva vtoroto chislo;
            }else { //i= 1 , 3
                secondArr[i]=currentArr[0];// na 1 idva purvto chislo;
                firstArr[i]=currentArr[1];// na 1 idva vtoro chislo;

            }


        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
