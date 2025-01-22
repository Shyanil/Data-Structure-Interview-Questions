import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        QueueAndStackSaga saga = new QueueAndStackSaga();
//        for (int i = 5; i >= 0; i--) {
//            saga.push(i + 1);
//        }
//        System.out.println(saga);
//        System.out.println(saga.removeE());
//        System.out.println(saga);
//        saga.addE(7);
//        System.out.println(saga);
//
//        System.out.println();
//        System.out.println("Two Stacks game");
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int aS = sc.nextInt();
//            int bS = sc.nextInt();
//            int sum = sc.nextInt();
//            int a[] = new int[aS];
//            int b[] = new int[bS];
//
//            for (int j = 0; j < aS; j++) {
//                a[j] = sc.nextInt();
//            }
//            for (int k = 0; k < bS; k++) {
//                b[k] = sc.nextInt();
//            }
//
//            System.out.println(TwoStackGame.twoStacks(sum , a , b));
//        }
//
         StackAndQueueSaga saga = new StackAndQueueSaga();
        for (int i = 5; i >= 0  ; i--) {
         saga.push(i+1);
        }

        System.out.println(saga);
        System.out.println(saga.pop());
        System.out.println(saga);
    }
}