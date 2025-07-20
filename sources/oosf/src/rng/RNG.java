/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since March, 2006
 */
package rng;

/**
 * This is an abstract class for pseudo random number generator classes.
 * @author Mesut Günes
 */
public abstract class RNG {
    
    /**
     * This is the only mandatory method, which returns the next random number.  
     * @return
     */
    abstract public double getNext();
}
