/**
 * A
 */
public class A {
   // its example of data hiding and the data hiding sub process encapsulation
   // this data hiding
   private int num; // private means its only access on this A class
   int arr[];
   String name;   // if you don't define any then its can be access it default then you only able to access in same package 

   protected int b; // this access in same package and same class but only in different package by subclass
   // i am access by Demo demo = new Demo but not works A demo = new Demo()

   // but this example of Encapsulation means i able to access this using getter and  change the value of  setter means its wrap the data into getter and setter
    public int getNum() {  
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        arr = new int[this.num];
    }
   

   
}

