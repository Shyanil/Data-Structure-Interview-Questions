public class Main {
    public static void main(String[] args) throws Exception {
//        CustomQueue customQueue = new CustomQueue();
//        customQueue.push(3);
//        customQueue.push(4);
//        customQueue.push(5);
//        customQueue.push(6);
//        customQueue.display();
//        System.out.println(customQueue.remove());
//        customQueue.display();
        CircularQueue circularQueue = new CircularQueue();
        for (int i = 0; i < 10; i++) {
            circularQueue.insert(i + 1);
        }
        circularQueue.display();
        System.out.println("Item removed " + circularQueue.remove());

        circularQueue.display();
    }
}