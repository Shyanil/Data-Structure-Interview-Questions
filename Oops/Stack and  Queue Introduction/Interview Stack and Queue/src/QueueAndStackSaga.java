public class QueueAndStackSaga extends CStack{
    private CStack f;
    private CStack s;
    public QueueAndStackSaga() {
        f = new CStack();
        s = new CStack();
    }


    public void push(int x) {
      f.push(x);
    }

    public int pop() {
      while (!f.isEmpty()){
          s.push(f.pop());
      }
      int removed = s.pop();
      while (!s.isEmpty()){
          f.push(s.pop());
      }
      return removed;
    }

    // now remove efficient O(1)

    public int removeE(){
        return f.pop();
    }

    // but i have change push because i have to use two stack  and push become O(n)
    public void addE(int value){
        while (!f.isEmpty()){
            s.push(f.pop());
        }
        f.push(value);
        while (!s.isEmpty()){
            f.push(s.pop());
        }
    }



    public int peek() {
        if(!f.isEmpty()){
            s.push(f.pop());
        }
        /* In the `peek()` method, the top element from stack `f` (e.g., `6`) is temporarily moved to stack
        `s` to allow for peeking without removing it. The method then retrieves the value from `s` using `s.peek()`
         and subsequently restores the original state by pushing the element back to
        `f`. As a result, stack `f` remains unchanged after the `peek()` operation. */

        int peek = s.peek();
        if(!s.isEmpty()){
            f.push(s.pop());
        }
        return peek;

        // return f.peek();
    }

    public boolean empty() {
      return f.isEmpty();
    }

    @Override
    public String toString() {
        return "QueueAndStackSaga{" +
                "f=" + f +
                ", s=" + s +
                '}';
    }
}

