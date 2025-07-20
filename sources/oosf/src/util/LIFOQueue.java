/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since April, 2007
 */
package util;

import java.util.LinkedList;
import core.SimEntity;

public class LIFOQueue extends LinkedList {

    public LIFOQueue() {
        super();
    }

    public void enqueue(SimEntity _o) {
        addFirst(_o);        
    }
    
    public SimEntity dequeue() {
        return (SimEntity) removeFirst();
    }
    
    public void dump() {
        for(int i=0; i<size(); i++) {
            SimEntity se = (SimEntity) get(i);
            System.out.println(se);
        }
    }
}// Stack
