import java.lang.reflect.Method;

public class Shapes {
    void fun(){
        System.out.println("Hello Shapes");
    }

  /*  from This class Circle and Triangle extends and the function name is same and parameters 
  and everything just body is different then we call this is a Method overriding or runtime polymorphism or dynamic */

    final void NotOverideen(){
        System.out.println("This is not overwrite");  // its early binding  early binding provides compile-time checking of all types so that no implicit casts occur
    }

    // all overridden function are all late binding a computer programming technique that determines which method or function to call at runtime


    // static method can be be inherited but not overridden 
    static void Greeting(){
        System.out.println("Hi i am in Shape class ! Greeting method");  // because static method are don't dependent on object creation so even if id create object for child class  and try to accces this its show me error
    }
    // this is always run no matter which object is calling
    // overriding depends on object  and static don't thats why static method can't be overridden


}
