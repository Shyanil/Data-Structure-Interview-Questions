/**
 * Enums.Example
 */
public class EnumsExample {

     //  enum are public , static and final
     // its final so we can't create child enmus
     enum Days implements interfaceE {    // it can implements many interfaces but not classes because Enum already extends java.lang.Enum.
          MONDAY,
          TUESDAY,
          WEDNESDAY,
          THURSDAY,
          FRIDAY,
          SATURDAY,
          SUNDAY;
           
          @Override
        public void index() {
            System.out.println("index");
            
        }

        Days(){   // by default these are private and default and this is not public and protected 
            // This is not Enum concept to initialization of more then one object 
            System.out.println("Constructor for  " + this);  // its singleton class behavior means every time when the 
            // reference variable created the there is only one object created and its call multiple time
            
          }
        
      }
      
      
      


     public static void main(String[] args) {
         Days dayOne;
         dayOne = Days.MONDAY;  //   here dayOne is become the Monday
         System.out.println(dayOne);
         // Each enum constant (like Days.THURSDAY, Days.WEDNESDAY, etc.) is a singleton. This means there is only one instance of each constant for the entire application.
        Days days = Days.THURSDAY;
        Days days1 = Days.WEDNESDAY;
        Days days2 = Days.FRIDAY;


         // we can use enhance for loop
         for(Days daysExDays : Days.values()){
          System.out.println(daysExDays);
         }
         System.out.println(days2.ordinal()); //  its basically print the index or order of the element 
         dayOne.index();
         
         // value of method the value itself
         System.out.println(Days.valueOf("MONDAY"));

     }
    
}