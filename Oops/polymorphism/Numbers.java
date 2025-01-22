public class Numbers {
    // constructors and the methord with same name call as a complie time polymorphisym
    //its use methord overloading
    // basically in compile time its define which method you need to call
    // in polymorphism method name are same but the type and argument must be differnet

    public Numbers(int a , int b) {
        System.out.println(a+b);
    }

    public Numbers() {
        System.out.println("Default constructors");
    }

    double sum(int a , int b , int c){  // part 1 double
        return  a+b+c;
    }

    double sum(int a ,  double b) {   // part 2 double
        return  a+b;
    }
    double sum(int a , int b){   // part 2 double
        return  a * b;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.sum(10 , 20); // here i pass two integer then its call the function tale two integer
        /* if i dont have the function that take integer
        for example take double ( double a , double b ) then the function convert
        it in integer autatically type crasting */
        System.out.println(numbers.sum(10 , 20 , 30)); // its call part 1
        numbers.sum(10 , 20.03); // its call part 2
    }
}
