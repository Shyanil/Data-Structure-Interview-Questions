/**
 * ObjectDemo
 */
public class ObjectDemo {
     
     int num;

     public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectDemo []";
    }   // Yes, the toString() method in Java returns a string representation of an object.

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.num == ((ObjectDemo)obj).num; // here we have to case because its Object type Object obj but our num variable is ObjectDemo Type
        // Now its checking the num value
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();   // Yes, the finalize() method in Java was designed to be called by the garbage collector before an object is destroyed
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();     // Yes, the hashCode() method in Java returns an integer that represents the hash code of an object.
    }
    
    public static void main(String[] args) {

        // its print different random number of every time when we print the objects 
        // its basically the random number we able to identify that objects are same or not 
        ObjectDemo objectDemo = new ObjectDemo(34);
        System.out.println(objectDemo.hashCode());

        ObjectDemo objectDemo2 = new ObjectDemo(34);
        System.out.println(objectDemo2.hashCode());     

        // we do this means we assign the newObj value to objectDemo2  just like int a = b
        ObjectDemo newObj = objectDemo2;
        System.out.println(newObj.hashCode());  // same value for objectDemo2 


        if (objectDemo == objectDemo2) {
            System.out.println("This two reference variable pointing to same Object or Not");
            // its print nothing because the its not pointing to same object
        }


        // equals() checking the content of a objects   means the number is equals to same withe number given 
        if (objectDemo.equals(objectDemo2)) {
            System.out.println("Yes These two Numbers are Same");
        }
        
        /* its return the boolean value its Checks either the reference variable newObj is instance of objectDemo class 
        every object is a instance of object class 
        and also the Object class */

        System.out.println(newObj instanceof ObjectDemo);
        System.out.println(newObj instanceof Object);

        // Yes, the getClass() method in Java is used to retrieve the runtime class of an object. 
        System.out.println(objectDemo2.getClass().getName());   // its return the class name // also getClass can't overridden because its final 

    }

    
}