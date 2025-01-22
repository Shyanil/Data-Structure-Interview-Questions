import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue is a interface and its follows FIFO AND LILO
        // we can create reference variable of queue but creating a object for linked list
        // because its kind a similar like if first element out in linked list then head move forward
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <= 3; i++) {
            queue.add(i + 1);
        }
        System.out.println(queue);

        // now we do peek its return the first item of queue
        System.out.println(queue.peek());
        for (int i = 0; i <= 3; i++) {
            System.out.println(queue.remove()  + " item is removed");
        }


        /*
         Now deque its also interface but we can insert it here at first and last or delete is on first or last
         `ArrayDeque` is a resizable, array-based implementation of a double-ended queue (deque)
         that allows efficient insertion and removal of elements from both ends in constant time.
        */
        Deque<Integer> deque = new ArrayDeque<>();
        // normal add adding in middle
        deque.add(4);
        deque.add(3);
        deque.addFirst(5);
        deque.addLast(6);
        System.out.println(deque);
        System.out.println("Item removed: " + deque.removeFirst()); // Removes and prints the first item
        System.out.println("Item removed: " + deque.removeLast());  // Removes and prints the last item
        System.out.println("Item removed: " + deque.remove());       // Removes and prints the next item
    }

    }
