package separateClasses;
import interfaceExample.*;
public class ElectricEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("Electric Engine is accelerating.");
    }

    @Override
    public void start() {
        System.out.println("Electric Engine is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine is stopping.");
    }
    
}
