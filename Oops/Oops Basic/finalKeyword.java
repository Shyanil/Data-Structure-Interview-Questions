class finalKeyword {
	final int a = 10;
	public static void main(String[] args) {
		// a = 20 ; we can't assign the value of a again beacuse its final
	

	// if it is non primitive data type then we can change the value but we can't re-assign it

	final Student st1 = new Student("Shyanil");
	st1.name = "mishra" ; // We can modify the fields of the object, 
	// but we can't reassign 'st1'
	// st1 =  new Student("akash");


   Student st2 ;

   for(int i = 0 ; i < 1000000000; i++){
   	st2 = new Student("random name");
   }
}


    
}

class Student{
	String name;

	Student(String name){
		this.name = name;
	} 


	// any object is created from Student this finallize  methord is called and object is distroyed


    @Override
	protected void finalize() throws Throwable{
		System.out.println("Object is distroyed becuse its load in memeroy");
	}
}