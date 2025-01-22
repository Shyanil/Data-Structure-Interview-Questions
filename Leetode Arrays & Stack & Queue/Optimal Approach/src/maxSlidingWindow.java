import java.util.ArrayDeque;
import java.util.Deque;

public class maxSlidingWindow {
    public static int[] maxSlidingWindowF(int[] a, int k) {
        int[] result = new int[a.length - k + 1];
        int ri = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < a.length; i++){
            if(!deque.isEmpty() && deque.peek() <= i - k){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && a[deque.peekLast()] <= a[i]){
                deque.pollLast();
            }

            deque.offerLast(i);

            if(i >= k - 1){
                result[ri++] = a[deque.peekFirst()];
            }
        }
        return result;

    }
}
