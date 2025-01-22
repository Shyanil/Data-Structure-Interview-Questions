public class DynamicCircularQueue extends CircularQueue{
    
    public DynamicCircularQueue() {
        super();
    }

    public DynamicCircularQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int value) {
        if (this.isFull()) {
            // Step 1: Create a new array 'temp' with double the size of the original array
            int[] temp = new int[data.length * 2]; // Increase the size to accommodate more elements

            // Step 2: Copy elements from the original 'data' array to the new 'temp' array
            // Explanation: (front + i) % data.length ensures that the circular queue is correctly unwrapped.
            // When the front pointer is ahead of the end pointer (due to wrapping), this formula
            // helps map elements correctly to the new array in a linear fashion.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length]; // Copy each element from old to new array, handling circular indexing.
                // Example:
                // Suppose 'data' = [10, 20, 30, 40], front = 1, end = 3, data.length = 4 (queue is full).
                // When i = 0: temp[0] = data[(1 + 0) % 4] = data[1] = 20
                // When i = 1: temp[1] = data[(1 + 1) % 4] = data[2] = 30
                // When i = 2: temp[2] = data[(1 + 2) % 4] = data[3] = 40
                // When i = 3: temp[3] = data[(1 + 3) % 4] = data[0] = 10
            }

            // Step 3: Reset 'front' to 0, as the data has been re-indexed from the beginning in the new array
            front = 0;

            // Step 4: Set 'end' to the original size of the data array, which is the current number of elements
            end = data.length;

            // Step 5: Replace the old 'data' array with the new 'temp' array (which has double the size)
            data = temp;
        }

// Insert the value into the queue (in the super class, assumed to handle the actual insertion logic)
        return super.insert(value);

    }

}
