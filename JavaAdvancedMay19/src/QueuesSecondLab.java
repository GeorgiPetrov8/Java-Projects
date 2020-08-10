//import java.util.ArrayDeque;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class QueuesSecondLab {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//
//        ArrayDeque<String> kidsQueue = Arrays.stream(scan.nextLine().split("\\s+"))
//                .collect(Collectors.toCollection(ArrayDeque::new));
//
//        int number = Integer.parseInt(scan.nextLine());
//
//        int cycle = 1;
//
//        while (kidsQueue.size() > 1) {
//            for (int i = 1; i < number ; i++) {
//                kidsQueue.offer(kidsQueue.poll());
//
//                if (isPrime(cycle)) {
//                    System.out.println("Prime " + kidsQueue.peek());
//
//                } else {
//                    System.out.println("Removed " + kidsQueue.poll());
//                }
//                cycle++;
//            }
//        }
//        System.out.println("Last is " + kidsQueue.poll());
//
//    }
//
//
