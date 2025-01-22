package comparisonObject;
public class Student implements Comparable<Student> {   // its a interface 
    int rollNO;
    int Marks;


    public Student(int rollNO, int marks) {
        this.rollNO = rollNO;
        Marks = marks;
    }


    @Override
    public int compareTo(Student o) {
        int diff = this.Marks - o.Marks;

        // if the value == 0 then the two object value is equal
        // if the value id less then 0 then 2nd compare Object is bigger
        // otherwise first one is bigger 
        return diff;
    }


    @Override
    public String toString() {
        return "Student [rollNO=" + rollNO + ", Marks=" + Marks + "]";
    }

    

    

    
}
