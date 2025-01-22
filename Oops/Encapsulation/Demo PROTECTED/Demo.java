
public class Demo  extends A{
    
    public Demo(int num , String name){
        super(num, name);
    }
 
    public static void main(String[] args) {
        // I can't able to access this because this a protected
        // A oA = new A(0, null);
        // int n = oA.b;  // protected variable in main class
        

        // I able to access this because i am using by subclass  reference variable
        Demo oDemo = new Demo(0, null);
        int b = oDemo.b;  // protected variable in main class 
        // subclass of Demo able to access this 
    }
}
