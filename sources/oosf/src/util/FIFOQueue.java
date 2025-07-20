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
import core.SimEvent;

public class FIFOQueue extends LinkedList {
    
    public FIFOQueue() {
        super();
    }
    
    public void enqueue(SimEvent _o) {
        add(_o);        
    }
    
    public SimEvent dequeue() {
        return (SimEvent) removeFirst();
    }
    
    public void dump() {
        for(int i=0; i<size(); i++) {
            SimEvent se = (SimEvent) get(i);
            System.out.println(se);
        }
    }

}// FIFOQueue
