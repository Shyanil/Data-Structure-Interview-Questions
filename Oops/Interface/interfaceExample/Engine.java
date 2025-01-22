/**
 * Engine
 */

package interfaceExample;
public interface Engine {

    // here by default all the variables are static and final
    static final int PRICE = 780000;
    
    void start();
    void stop();
    void acc();

    // two classes are not related to each other they can implement the same interface


}