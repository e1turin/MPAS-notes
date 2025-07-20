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


public class Uniform extends RNG {
    double min;
    double max;
    Random uniform;
    	
    /**
     * Constructor for a uniform random number generator.
     */
    public Uniform(double _min, double _max){
        min = _min;
        max = _max;
        uniform = new Random(System.currentTimeMillis());    
    }
    
    /**
     * Return the next random uniform number between min and max
     * @see rng.RNG#getNext()
     * @return Uniform random number between min and max.
     */
    public double getNext() {
        return ( min + (max - min) *uniform.nextDouble() );
    }
       
}
