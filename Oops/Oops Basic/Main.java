class Main{  
    public static void main(String[] args) {
    	
    	Student student1; // student1 are reference variables
    	// now this line creating a object
    	student1 = new Student();  // here new dynamically allocated meaning and return the reference to it
    	// here Student() is constructor 
    	// dynamically allocated meaning when program is running then memory is allocated
    	// Now accesing the reference variables and set value of instance variables
    	// we use this using dot operator



    	// here i initialize the value for particular reference variables
    	// student1.rollNo = 20;
    	// student1.name = "Shyanil Mishra";
    	// student1.Marks = 82.05f;
    	// System.out.println(student1.rollNo);
    	// System.out.println(student1.name);
        // System.out.println(student1.Marks);

          // Student st2 = new Student(); // open demo boy in student constructor
         // Student st3 = new Student();
         // st2.greeting();
         // st3.printStudent();
     
         // Student random = new Student(st2);  // its giving demo boy because it takes value st2 and st2 constructor (Student()) dont have any parameters that why its print default value
         // System.out.println(random.rollNo);

    	Student st4 = new Student();
    	System.out.println(st4.rollNo);

    	// Both one and two referring to the same object
    	Student one = new Student();
    	Student two = one;
        
        // i chnaging the name in defalut constructor otherwise its print  default Constructor for this() open or its print demo boy
   	    one.name = "Something Something";
        System.out.println(two.name);


    }

 
}

   // create a class or template Student
class Student{
	// and class Objects its occpy space in memeory
	// rollNo name Marks are instance variables
	int rollNo; 
	String name;
	float Marks;

	// this will replace by reference variables
	// for every reference variables when we creating object its has same value
    // when we call constructor with one values its call this
	Student(){

		// if we here put this value its always print if i dont pass anything inside if new object creation means new student("if its is empty then call this")
		// this.name = "Demo Boy";
		// this.rollNo = 12;
		// this.Marks = 45.6f;




		// thats how you can call constructor to another constructor its call this one Student(int rollNo , String name , float Marks)
		this(13000888 , "default Constructor" , 56.8f); // its call the st4 reference variable
	}


	void greeting(){
		System.out.println("Hello From " + this.name);
	}

	void printStudent(){
	System.out.println(this.rollNo);
    System.out.println(this.name);
    System.out.println(this.Marks);
	}
    // When there's no ambiguity ( do not have same name of variables), both versions (with or without this) work the same.
    //  Use this to avoid ambiguity when instance variables and parameters share the same name.
    // when we call constructor with 3 values its call this
	Student(int rollNo , String name , float Marks){
		this.rollNo = rollNo;
		this.name = name;
		this.Marks = Marks;
	}

    // constructor take value from another object 

    Student(Student other){  // this constructor taking example st2 value
    	// basically see above random.rollNo = st2.rollNo
    	this.rollNo = other.rollNo;
    	this.name = other.name;
    	this.Marks = other.Marks;

    }



}
