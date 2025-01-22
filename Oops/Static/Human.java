public class Human {
     // for every human class object creation this things are need
    String name;
    int age;
    boolean married;
    String gender;

    // static variable the is same for every human object creation
    static  int population; // static variable common to everyone

    public Human(String name, int age, boolean married, String gender) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.gender = gender;

        /* when object created this number increase by one even if
         i call any one of one its print 3 because i
        have 3 object in Main class */
       // static method dont need object its called directly by class
        Human.population += 1;
    }
}
