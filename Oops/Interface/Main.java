import interfaceExample.*;
import separateClasses.*;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.brake();
        car.start();
        car.stop(); // which particular method need to run its determine in run time 

        Engine as = new Car();  
        // as.brake()  i can't able to call that because same thing reference variable tell use which thing we able to access and object creation new Car(); basically just override
        
        // now i want to stop the music of the car
        Media media = new Car();
        media.stop();  // its stop the car not music means its call the Car stop method because  new Car(); part define which one have to access



        // now I calling the Nice Car from separateClasses
       NiceCar niceCar = new NiceCar();
       System.out.println("THE CAR IS NOW ON");
       System.out.println();
       System.out.println();
       System.out.println();
        // step by step  start my car with electric then i change it to petrol or power 
        niceCar.Start();
        niceCar.StartMusic();
        niceCar.UpgradeEngine();
        niceCar.Start();
        niceCar.Acc();
        niceCar.Stop();
   

    }
}
