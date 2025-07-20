/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since March, 2006
 */

/**
 * This package contains all the core classes of the simulator.
 */
package core;

/**
 * SimQueue is an abstract class for the management of the Future Event 
 * List (FEL) which stores all event notifications.
 * @author Mesut Günes
 * @since 22.03.2006
 */
public abstract class SimQueue {
		
	/**
	 * Schedule the given event according to the event time.
	 * @param event
	 * @see SimEvent
	 */
	abstract public void schedule(SimEvent event);
	
	/**
	 * Return the next event in the queue.
	 * @return imminent event in queue.
	 * @see SimEvent
	 */
	abstract public SimEvent getNextEvent();
    
    /**
     * Test whether the FEL is empty
     * @return
     */
    abstract public boolean isEmpty();    
	
	/** 
	 * This method dumps the content of the queue.
	 * It is for debugging purposes. 
	 */
	abstract public void dump();
    
}// SimQueue
