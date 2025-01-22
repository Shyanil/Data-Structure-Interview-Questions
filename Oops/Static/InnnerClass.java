public class InnnerClass {
   // Now i have to make demo class as static otherwise its dont call because its depend on the InnerClass
      static  class demo{
        String name;
        public demo(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        demoOutside obj = new demoOutside("Shyanil");
        System.out.println(obj.name);  // its outside class

            /*
            static means dont depend on instance of class object of class . Means its dont depend on Innnerclass
            but its have own individual identity thats why if we created two  reference variable to create a object its depend on each other
            so everytime new object created new name also print
           */
            demo objt = new demo("Shyanil demo");
            demo objs = new demo("demo demo");
            System.out.println(objt.name);
            System.out.println(objs.name);
    }
}
// its can easily be called because its dont depend on any other class
class  demoOutside{
    String name;
    public demoOutside(String name) {
        this.name = name;
    }
}