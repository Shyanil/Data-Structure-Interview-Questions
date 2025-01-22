public class staticBlock {
    // i created two static variables
    static  int a = 10;
    static  int b;

    /* this static block only called once when first object
     created or when class is loaded for the first time */

    static {
        System.out.println("I am static block");
        b = a + a;
    }

    public static void main(String[] args) {
        // I created a Object for  staticBlock class and my static block first time called
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);


        // Now 2nd time i created object but its not called
        staticBlock obj2 = new staticBlock();
        staticBlock.b += 2; // its only plus two not multiplying a * a again then + 2 not
        System.out.println(staticBlock.a + " " + staticBlock.b);  // also I am static block not print

    }

}
