/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since March, 2006
 */

package core;

import java.util.LinkedList;
import java.util.NoSuchElementException;


/**
 * @author Mesut Günes
 * This class implements the most simple queue, which 
 * is the linked list. We don't implement the linked list explicit,
 * instead use the existing implementation of the Java class library. 
 */
public class SimLinkedList extends SimQueue {
	LinkedList fel;
	
	public SimLinkedList() {
		fel = new LinkedList();
		
	}
	
	public void schedule(SimEvent event) {
		// First find the index of the position for time.
		int index = fel.size();
		for(int i=0; i<fel.size(); i++) {
			SimEvent e = (SimEvent) fel.get(i);
			if( e.time >= event.time ) {
				index = i;
				break;
			}
		}
				
		// Second, insert event at this position.
		fel.add(index, event);		
	}
	
	public SimEvent getNextEvent() {
		SimEvent event = null;
		try { 
			event = (SimEvent) fel.removeFirst();
			return event;
		}
		catch(NoSuchElementException e) {
			return null;			
		}			
	}
	
	public void dump() {
		for(int i=0; i<fel.size(); i++) {
			SimEvent event = (SimEvent) fel.get(i);
			System.out.print(event.toString());
		}
	}

    public boolean isEmpty() {
        return fel.isEmpty();
    }

}
