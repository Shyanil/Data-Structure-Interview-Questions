import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       // This is Default Stack
        // Last in First Out // LIFO
        // Fast in Last out // FILO
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.add(i +  1);
        }
        System.out.println(stack);
        // now i remove all of this
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
            // you see that its remove from 5 to 1
        }
    }
}