
public class DynamicStack extends CustomStack{
    // its a child class that only override the

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean isInsert(int value) {
        // if the size is full then increase array / Stack Size
        if(isFull()){
            // just double the size of data if it is full
            int [] temp = new int[data.length * 2];
            // its goes first 0 to data length then copy all the data in temp and increase the size
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.isInsert(value); // otherwise all are remains a the same
    }
}
