public class SingleTon {
    // Private constructor prevents the creation of multiple objects of this class
    // from outside the class, ensuring that it can only be instantiated within the class itself.
    private SingleTon() {
    }

    // A static variable that will hold the single instance of the SingleTon class.
    // This is static because we want it to be shared across all instances and
    // ensure only one instance of the class is created (Singleton pattern).


    // its similar to human class population here its can't be change and dont depend on any objects if the SingleTon
    private static SingleTon Instance;  // Instance is a static variable that holds the single instance of the SingleTon class.


    // A static method to provide access to the single instance of the SingleTon class.
    // If the instance has not been created yet (Instance is null), this method creates it.
    // Otherwise, it returns the already created instance.


/* The method getInstance() is intended to provide a reference to an object of the SingleTon class.
   Therefore, the return type must match the class type, which in this case is SingleTon.
 */
    public static SingleTon getInstance() {
        // Check if the Instance is null, meaning no instance has been created yet
        if (Instance == null) {
            // Create the instance by calling the private constructor
            Instance = new SingleTon();
        }
        // Return the same instance every time this method is called
        return Instance;
    }
}
