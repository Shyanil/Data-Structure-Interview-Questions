package Staticmethordininterface;


public class Main implements AB {
      
    @Override
    public void fun() {
        // TODO Auto-generated method stub
        System.out.println("This is fun");
        
    }

    public static void main(final String[] args) {
        Main main = new Main();
        AB.greening();
        main.fun();
    //    to run this - javac Staticmethordininterface\AB.java Staticmethordininterface\Main.java
    //    java Staticmethordininterface.Main

    }
}
