interface A {
    default void show() {
        System.out.println("A's show method");
    }
}

interface B {
    default void show() {
        System.out.println("B's show method");
    }
}

class defaultExmaple implements A, B {
    @Override
    public void show() {
        // You must provide an implementation to resolve the ambiguity
        A.super.show(); // Calls A's show method
        B.super.show(); // Calls B's show method
    }

    public static void main(String[] args) {
        defaultExmaple obj = new defaultExmaple();
        obj.show();
    }
}

/* 
 * 
    Reusability: Add features to interfaces without breaking existing classes.

    Backward Compatibility: New methods don't affect classes already using the interface.

    Multiple Behavior: Classes can use methods from multiple interfaces easily.

 * 
 */
