package comparisonObject;
import java.util.Arrays;
import java.util.Comparator;;
public class Main2 {
    public static void main(String[] args) {
        Student object1 = new Student(10 , 78);
        Student object2 = new Student(20, 90);
        Student object3 = new Student(30, 90);
        Student object4 = new Student(40, 70);

        /* 
        please run on terminal
         * PS F:\DSA\Oops\Generics> javac comparisonObject/Student.java
            PS F:\DSA\Oops\Generics> javac comparisonObject/Main2.java
            PS F:\DSA\Oops\Generics> java comparisonObject.Main2
         */

        if (object1.compareTo(object2) < 0) {
            System.out.println("The object2 is bigger marks then object1");
        }

        if (object2.compareTo(object3) == 0) {
            System.out.println("The object3 and object marks same");
        }

        if(object3.compareTo(object4) > 0){
            System.out.println("The object3 is bigger marks then object4");
        }

        // sorting the list
        Student[] lStudents = {object1 , object2 , object3 , object4};
        System.out.println(Arrays.toString(lStudents));
        Arrays.sort(lStudents); // its sort by number because in Student class i override compareTo method for Checks the marks 
        // if i remove Comparable<Student> then java don't understand which thing to compare 
        System.out.println(Arrays.toString(lStudents));


        // we can add comparator in sort method
        /*
        
        In the comparator, o1 and o2 represent any two Student objects from the lStudents 
        array being compared during the sorting process based on their Marks.
         * 
         */

         /*
          * Intermediate Comparisons:

        Intermediate Comparisons:
            // https://chatgpt.com/c/66fe8579-308c-8007-ae28-0b3bcb606643
           first 78 vs 90 and 80 become first then than 90 - 90  same place 90 90 then 78 
           here first 02 - o1 means 2nd object checks first then place 
          */

          System.out.println("After sorting");
       Arrays.sort(lStudents , new Comparator<Student>() {
           @Override
           public int compare(Student o1 , Student o2){
            return o2.Marks - o1.Marks;
           }
       });

       // we cam reWrite this using lambda 

       Arrays.sort(lStudents , (o1, o2) -> o2.Marks - o1.Marks);

       System.out.println(Arrays.toString(lStudents));



    }
    
}
