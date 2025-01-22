public class Main {
    public static void main(String[] args) {



        BoxCopy boxCopy =  new BoxCopy(10 ,20 , 30 , "Shyanil Box");
        System.out.println(boxCopy);  // its print all the value because I created to-string

        /*
         parent class reference variable point to the child class object,
         but you are only able to access with reference variable only parent class parameters
         because the reference variable is a part of parent class
         and reference variable determent's what members can be accessed
         you only have access those parts of the object that define in superclass
        */

         Box obj = new BoxCopy(10,20,30,"Demo Box");
         System.out.println(obj.height + obj.length + obj.width) ;  // we can't call obj.boxName;


        /*

          Here i try to achieved the call from child to parent but we know the parent dont know about the below class
          but below class know about the child classes i able to call the Super class but when i try to inlined the value of
          "BoxName" ITS give me error because in Box class there is no such box name
          common sense here the Object its self the parent class constructor then how can you call the child class constructor
          So you don't have child object variable and reference Object
                 BoxCopy obj1 = new Box(10 ,2 ,3,);
         */
          BoxCopy boxCopy1 = new BoxCopy(10 ,20 ,30 ,"Shyanil");
          Box boxCopy2 = new BoxCopy(boxCopy1);  // its actually call the  boxCopy1
          System.out.println(boxCopy1);
          System.out.println(boxCopy2);

          BoxPrice boxPrice = new BoxPrice(10,40,100, "shyanil", 30);
          System.out.println(boxPrice);
          Box box = new BoxPrice(10 , 20 , 30 ,  "Shyanil Mishra" , 20);


         BoxCopy boxPrice1 = new BoxPrice(10,20,30,"boxName", 20);
         System.out.println(boxPrice1);

       BoxCopy yy = new BoxCopy(1 , 2, 3 , "sHYANIL");
        System.out.println(yy);   /* if i command out SUPER AND and print
        this its print the 10 . 40 (beacuse you see in below of BoxCopy i do super.height = 40 and then length 20 + 10
        its print the default constructor from bOX) */

    }
}
