package CustomLinkedArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        LInkedList lInkedList = new LInkedList();

       lInkedList.addFirst(5);
       lInkedList.addFirst(2);
       lInkedList.addFirst(4);

       lInkedList.forEach(System.out::println);

    }


}
