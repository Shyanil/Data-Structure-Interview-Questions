package interfaceExample;



public class Car implements Engine , Brake , Media{

     // Now We can implement the as many inheritance we want
     // even if the Media and Engine has own same method name but car adding its own value / body 
     // thats why we use separate class 

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("Accelerating the vehicle.");
    }
    
    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Starting the vehicle.");
    }
    
    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stopping the vehicle.");
    }
    
    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("Applying the brakes.");
    }
    

   

    
    
}
