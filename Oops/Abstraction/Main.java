public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        son.Career();  // its override the abstract method in parent class

        Daughter daughter = new Daughter(21);
        daughter.Career();  // its override the abstract method in parent class



        // i can't create a object for Parent i can override only because this is abstract class 
        // if we implant a method then fine otherwise not 

        // Parent parent = new Parent(60);

        

        // calling static class 
        Parent.staticMethod();

        son.normalMethod(); // via son object creation 
        daughter.normalMethod();  // via daughter object creation 
        
        // we can do this but its overridden typeof object creation we can create a reference variable of Parent but its overridden by Son method on runtime 
        Parent parentfromSon = new Son(0);
        parentfromSon.Career();

        System.out.println(son.VALUE);   // i able print the final via child object creation reference variable
        
    }


}
