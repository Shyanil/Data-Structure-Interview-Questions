import java.util.Stack;

public class StockSpanner {
    Stack<int[]> stack = new Stack<>();
    int index = -1;
    public StockSpanner() {
    index = -1;
    stack = new Stack<>();
    }

    public int next(int val){
        index++;
        int span;
        while (!stack.isEmpty() && stack.peek()[0] <= val){
            stack.pop();
        }

        span = index - ((stack.isEmpty()) ? -1 : stack.pop()[1]);
        stack.push(new int[]{val , index});
        return span;
    }
}
