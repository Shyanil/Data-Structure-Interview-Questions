package separateClasses;
import interfaceExample.*;
public class NiceCar {
    // data hiding 
    private Engine engine;    
    private  Media media = new cdPlayer(); // here i use object creation directly here because in car there is one mediaSystem 

    public NiceCar() {   // default engine 
         engine = new ElectricEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    
    // Method to start the car's engine
    public void Start() {
        engine.start();
    }

    // Method to stop the car's engine
    public void Stop() {
        engine.stop();
    }

    // Method to accelerate the car
    public void Acc() {
        engine.acc();
    }

    // Method to start the music
    public void StartMusic() {
        media.start();
    }

    // Method to stop the music
    public void StopMusic() {
        media.stop();
    }

    public void UpgradeEngine(){
        engine = new powerEngine();
    }



    
}
