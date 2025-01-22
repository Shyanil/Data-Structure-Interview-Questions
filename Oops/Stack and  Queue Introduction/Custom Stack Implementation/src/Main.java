public class Main {
    public static void main(String[] args) throws Exception {
        CustomStack customStack = new CustomStack();
        customStack.isInsert(4);
        customStack.isInsert(3);
        customStack.isInsert(5);
        customStack.isInsert(4);
        customStack.isInsert(3);
        customStack.isInsert(5);
        customStack.isInsert(5);
        customStack.isInsert(4);
        customStack.isInsert(3);
        customStack.isInsert(5);
        customStack.isInsert(120);  // here don't extra item added because the size is full
        System.out.println(customStack);
        System.out.println(customStack.isPop());
        System.out.println(customStack);
        System.out.println(customStack.isPeek());  // now peek is 3 because the 5 is remove previous step


        // the size neve gets full
        CustomStack stack = new DynamicStack();
        for (int i = 0; i < 12 ; i++) {
            stack.isInsert(i + 1);
        }
        System.out.println(stack);

    }
}