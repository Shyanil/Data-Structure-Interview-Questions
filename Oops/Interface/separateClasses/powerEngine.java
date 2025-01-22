package separateClasses;
import interfaceExample.*;
public class powerEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("Power Engine is accelerating.");
    }

    @Override
    public void start() {
        System.out.println("Power Engine is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine is stopping.");
    }
    
}
