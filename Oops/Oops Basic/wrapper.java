class wrapper {
	public static void main(String args[]){
		int a = 10 ;
		int b = 20;

		swap(a , b); // its dont swap beacuse java are pass by value 

		// In array its works because you're passing a reference to the arr 


        // now we creating a object Integer a = new Integer()
        // passing the reference variable to it
		Integer a = 10 ;
		Integer b = 20
		swap(a , b); // its dont works beacuse final keyword
	}

    // its swaping here dont in main function
	static void swap(int a , int b){
		int temp = a;
		a = b;
		b = temp;
       }
}