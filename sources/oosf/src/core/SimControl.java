/**
 * Object-Oriented Discrete Event Simulation in Java
 * This package is designed for teaching purposes at 
 * RWTH Aachen University, Aachen, Germany
 * Design and realization by 
 * @author Dr. Mesut Günes
 * @since March, 2006
 */

package core;


/**
 * This class realizes the core functionality of the simulator.  It 
 * contains the scheduling and dispatching functions. SimControl controls the 
 * current simulation clock @see SimControl.time and the queue which holds 
 * the events.
 * @author  Mesut Günes 
 * @see SimQueue
 * @see SimEvent
 */
public class SimControl {
    /**
     * There is a need only for one simulator and this can be accesses directly.
     */
    public static SimControl simulator;
    
    /**
     * Queue holds the future-event-list (FEL)
     */
	private SimQueue queue;
	
	/**
     * The current simulation time
     * @uml.property   name="time"
     */
	private double time;
	
	/**
	 * The total runtime of the simulation.
	 */
	private double endTime;
    
    /**
     * If logEvents is true, for each event is printed
     */
    private boolean logEvents = false;
    
    /**
     * The default queue of the simulator is the linked list.
     * The user can select other queues as well.
     * @see SimControl
     */
    public SimControl() {
        queue = new SimLinkedList();
        SimControl.simulator = this;
    }
		
	/**
	 * The simulation control works with different queues, which 
	 * the user can select
	 * @param _queue
	 * @see SimQueue
	 */
	public SimControl(SimQueue _queue) {
		queue = _queue;
        SimControl.simulator = this;
	}
	
    /**
     * This method implements the event-scheduling/time forwarding mechanism of 
     * the discrete event simulator. 
     */
	public void run() {
		SimEvent event;
		while( queue.isEmpty() == false ) {
            // If there is an event in the FEL and the simulation end time is 
            // not reached ...
            event = queue.getNextEvent();
			time = event.getTime();
			if( event.getTime() <= endTime ) {
                // ... call the events destination object
                dispatch(event);						
			}			
		}
	}
	
    /**
     * The dispatcher calls the <code>handleEvent</code> method of the 
     * appropriate <code>SimEntity</code>.
     * @param event
     * @see SimEntity
     */
	private void dispatch(SimEvent event) {
        if( logEvents ) {
            System.out.println(event);
        }
		event.getDestination().handleEvent(event);		
	}
	
    /**
     * Set the end of the simulation time to <code>_runtime</code>
     * @param _runTime
     */
	public void setRunTime(double _runTime) {
		endTime = _runTime;
	}
    
    /**
     * Schedule the given event notice into the FEL
     * @param event
     */
    public void schedule(SimEvent event) {
        if( event.getTime() > endTime ) {
            //System.out.println("SimControl@schedule: scheduling time " + event.getTime() + " is after simulation runtime " + endTime + "!");
        }
        else {
            queue.schedule(event);
        }
    }
    
    /**
     * Schedule the given event notice on the FEL for later time
     * @param event
     * @param _delta
     */
    public void schedule(SimEvent event, double _delta) {
        event.setTime(time+_delta);        
        schedule(event);
    }
	
	/**
     * @return  Returns the time.
     * @uml.property  name="time"
     */
	public double getTime() {
        return time;
    }
    
    /**
     * Dump the content of the FEL     
     */
    public void dumpQueue() {
        queue.dump();
    }

    /**
     * @return the logEvents
     */
    public boolean isLogEvents() {
        return logEvents;
    }

    /**
     * @param logEvents the logEvents to set
     */
    public void setLogEvents(boolean logEvents) {
        this.logEvents = logEvents;
    }             
}
