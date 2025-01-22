public class Main {
    public static void main(String[] args) {
        System.out.println(Human.population);  // here its 0 because object is no created

        // One Object is created means population is increase by one its total by 3
        Human st1 = new Human("Shyanil Mishra" , 22,false,"Male");
        Human st2 = new Human("Tanushree Mishra" , 22,false,"Male");
        Human st3 = new Human("Dibyendu Kumar Mishra" , 22,false,"Male");

        System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(st3.name);

        // now the object is created by increase one population
        System.out.println(Human.population);  // static variable are dont depended on object


        // greeting(); i can't able to access this because this is non static . So static method only access the static data


        // No we creating the object with help of reference variable
        // you can't access the non-static stuff without referencing their instance

        Main rb = new Main();
        rb.greeting(); // now its print

       // calling two non static method once
        Main db = new Main();
        db.demo();



        // SingleTon class check
        // All these reference variables point to the same object because of the Singleton pattern.
        SingleTon  obj = SingleTon.getInstance();
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();

        // Let's check if all the references are indeed pointing to the same instance.
        System.out.println("Checking if obj, obj1, and obj2 refer to the same instance:");
        System.out.println(obj == obj1); // true
        System.out.println(obj1 == obj2); // true
        System.out.println(obj == obj2);  // true
    }


   //  we know that something non static belongs to the objects . And this has instance
    void greeting() {
        System.out.println("The greeting method is non static");

        // we can call the static methord inside non static
        fun();
    }

    void  demo(){
        /* we can call the non-static method inside nonstatic because at
         the end its all going to call inside of static method (main method here).
         and also the object is going to create for this method demo_ */
        greeting();
    }
    static void fun(){
       //   greeting()   here its also not called because object needed
    }
}
