/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since March, 2006
 */
package rng;

import java.util.Random;

/**
 * @author Mesut Günes
 *
 */
public class Exponential extends RNG {
    double lambda;
    Random uniform;
    
    public Exponential(double _lambda) {
        lambda = _lambda;
        uniform = new Random(System.currentTimeMillis());
    }

    /** 
     * Return the next exponentially distributed random number
     * @see rng.RNG#getNext()
     */
    public double getNext() {
       return -Math.log(uniform.nextDouble())/lambda;        
    }

}
