/**
 * Human
 */
public class Human implements Cloneable{  /*   this  Cloneable interface don't have anything abstract class 
or anything its just telling JVm Human class use the clone Method
*/
    // this class has method to help avoid every time new keyword we just use the function to clone
    int age;
    String Name;
    int arr[];

    public Human(Human otHuman){
      this.age = otHuman.age;
      this.Name = otHuman.Name;
    }

    public Human(int age, String name) {
        this.age = age;
        Name = name;
        arr=new int[]{2 , 3, 4,5};
    }

    // the clone method instant every time create a object with new keyword 
    // new keyword take lot of processing time thats why we use clone for creating clone of object
    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();  // its use shallow copy means 
    //     // This is shallow copy
    // }

    @Override
    public String toString() {
        return "Human [age=" + age + ", Name=" + Name + "]";
    }
    
    // This is deep copy 
    @Override
    public Object clone() throws CloneNotSupportedException{
        Human twiHuman = (Human) super.clone();

        twiHuman.arr = new int[twiHuman.arr.length];  // its creating a new array same size

        for(int i = 0 ; i < twiHuman.arr.length ; i++){
            twiHuman.arr[i] = this.arr[i]; // now copy all the elements when Human class Object created 
                           /// Now if you call the reference variable then only the value change otherwise nothing changed for old or Main object you want to call ('sHuman  object in Main class')
        }
        return twiHuman;

    }


}