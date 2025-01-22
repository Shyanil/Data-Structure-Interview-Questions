package separateClasses;
import interfaceExample.*;
public class cdPlayer implements Media {

    @Override
    public void start() {
        System.out.println("CD Player is starting.");
    }

    @Override
    public void stop() {
        System.out.println("CD Player is stopping.");
    }
    
}
