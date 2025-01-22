/**
 * Parent
 */
public abstract class Parent {
    // Amy Class contains one or more abstract Method also CLass name declare as a abstract class 
    // abstract method don't have any body thats why  child class must override them means runtime polymorphism
    public abstract void Career();
    
    int age;

    // i can't make it class final because final means its methods are ca't inherited but i can create final parameter 
    final int VALUE;
    // even if i create constructor i don't able to create object of abstract class

    static int s; // i also can do here and its call or assign by Parent.s
     Parent(int age){
        this.age = age;
        VALUE = age;  // I able to call this child class object creation
     }


     // abstract method needs to be overridden but static method not overridden thats why we don't create this
     //  static abstract hello();

     // but we can create a static method because thats don't relay on object 

     static void staticMethod(){
        System.out.println("I am from staticMethod");
     }

     /*  we also create normal method  buts thats not call by parent class i can call this via child class object creation because again 
      overridden means runtime polymorphism */

      void normalMethod(){
        System.out.println("I am from normalMethod");
      }



}

