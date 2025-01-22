public class CircularQueue {
    // This is a circular queue, meaning it works in a circle-like manner.
    // When we reach the end of the array, we go back to the beginning.
    protected int[] data; // This array will hold the queue items.
    private static final int DEFAULT_SIZE = 10; // Default size of the queue is 10.
    protected int front = 0; // Points to the front element in the queue.
    protected int end = 0; // Points to the next available position where we can insert an item.
    protected int size = 0; // Keeps track of the number of items in the queue.

    // Constructor with default size
    public CircularQueue() {
        this(DEFAULT_SIZE); // Calls the constructor below to initialize the queue with default size.
    }

    // Constructor with custom size
    public CircularQueue(int size) {
        data = new int[size]; // Initializes the queue array with the given size.
    }

    // This method inserts an item at the end of the queue.
    public boolean insert(int value) {
        if (isFull()) { // Check if the queue is full.
            return false; // If full, insertion fails.
        }
        // Insert the value at the 'end' position, then increase 'end'.
        data[end++] = value; // Insert the value, then 'end' moves to the next spot.
        // If 'end' reaches the end of the array, it wraps around to 0.
        end = end % data.length; // This makes the queue circular, so 'end' goes back to 0 if it reaches the array size.
        size++; // Increase the size since we added a new element.
        return true; // Return true to show that insertion was successful.
    }

    // This checks if the queue is full.
    protected boolean isFull() {
        return size == data.length; // The queue is full when the number of elements equals the array size.
    }

    // This checks if the queue is empty.
    private boolean isEmpty() {
        return size == 0; // The queue is empty when there are no elements (size is 0).
    }

    // This method removes an item from the front of the queue.
    public int remove() {
        if (isEmpty()) { // Check if the queue is empty.
            System.out.println("Sorry, the queue is empty."); // Print a message if the queue is empty.
        }

        // Remove the item at the 'front' position, then increase 'front'.
        int removed = data[front++]; // Remove the element at the front and then move 'front' to the next position.
        // If 'front' reaches the end of the array, it wraps around to 0.
        front = front % data.length; // This makes the queue circular, so 'front' goes back to 0 if it reaches the array size.
        size--; // Decrease the size since we removed an element.
        return removed; // Return the removed item.
    }

    // This method displays all elements in the queue.
    public void display() {
        if (isEmpty()) { // Check if the queue is empty.
            System.out.println("The queue is empty."); // Print a message if the queue is empty.
        }

        int i = front; // Start displaying from the 'front' of the queue.
        do {
            System.out.print(data[i] + " -> "); // Print the current element.
            i++; // Move to the next element.
            i %= data.length; // Wrap around to the start if we reach the end of the array.
        } while (i != end); // Stop when we reach the 'end' position.
        System.out.println("END"); // Indicate the end of the queue.
    }
}
