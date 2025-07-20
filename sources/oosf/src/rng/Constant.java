/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since March, 2006
 */
package rng;

public class Constant extends RNG {
    double interArrivalTime;
    
    public Constant(double _interArrivalTime) {
        interArrivalTime = _interArrivalTime;        
    }

    public double getNext() {
        return interArrivalTime;
    }
}
