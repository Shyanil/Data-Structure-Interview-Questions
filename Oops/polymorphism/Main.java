public class Main {
    public static void main(String[] args) {
      //Both overloading and overriding doest apply to instance variable 

        Numbers obj = new Numbers(10 ,20);
        Shapes shapes = new Shapes();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        
        
        
        // Shapes shapes2 = new Circle();   // its still print the child class method because
        /* If type of the reference variable is parent class then we able to access the  function area() from there means if the 
        in Parent Class don't have area() function then i can't able to do shapes2.area() because the reference variable is parent class 
        if i Directly do   Circle shapes2 = new Circle();  then its works if the  shapes2.area() [if area method in Circle]


        Then here first the area() function call by reference variable is parent class then its overridden by child class
        here type is parent class Shapes shapes2 but object creation is child class new Circle(); This Known as upcasting

          CHILD TYPE DEFINES WHICH ONE TO RUN, AND OBJECT REFERENCE DEFINES WHICH ONE TO ACCESS.

          its works by dynamic method dispatch
          and thats why its called runtime polymorphism 
          the process by which a call to an overridden method is resolved at runtime (during the code execution)
          basically its override the parent class function area at runtime and also object creation determine which to print Circle area methord
        */
        Shapes obShapes = new Triangle();
        obShapes.Greeting();


        // Triangle obShapes1 = new Triangle();
        // obShapes.Greeting();   // if you close the Triangle  class function and try to run this again then its also call the if you access Greeting

    }
}
