package Staticmethordininterface;

public interface AB {
    // static method don't depend on Object thats why we must define a body of static method
    static void greening(){
        System.out.println("This is Static");
    }

    void fun();
}
