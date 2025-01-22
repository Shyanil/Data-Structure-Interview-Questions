import java.util.Arrays;

public  class CStack {

    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    private int size;
    private int pointer = -1;

    public CStack() {
        this(DEFAULT_SIZE);
    }

    public CStack(int size) {
        data = new int[size];
    }


    public void push(int value) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            temp = data;
        }

        data[++pointer] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Please Fill Your Stack");
        }

        int removeV = data[pointer];
        data[pointer] = 0;
        pointer--;
        return removeV;
    }

    public boolean isFull() {
        return pointer == data.length;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    public int peek() {
        return data[pointer];
    }

    @Override
    public String toString() {
        return "CStack{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }
}