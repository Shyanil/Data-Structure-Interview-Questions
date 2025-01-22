public class StackAndQueueSaga
{
    private CQueue first;
    private CQueue second;
    public StackAndQueueSaga() {
        first = new CQueue();
        second = new CQueue();
    }

    public void push(int x) {
      first.push(x);
    }

    public int pop() {
     while (!first.isEmpty()){
         second.push(first.pop());
     }
     int removed = second.pop();
     while (!second.isEmpty()){
         first.push(second.pop());
     }
     return removed;
    }

    public int top() {
      return first.top();
    }

    public boolean empty() {
    return second.isEmpty();
    }

    @Override
    public String toString() {
        return "StackAndQueueSaga{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}


