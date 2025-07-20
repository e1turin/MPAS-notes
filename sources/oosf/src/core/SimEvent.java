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
 * This class implements an event in the simulation world.  
 * An event consists of time, type, source, and destination.
 * @author Mesut Günes
 * @see core.SimEntity
 */
public class SimEvent {
	double time;
	int type;
	SimEntity src;
	SimEntity dst;
    public long id;

    /**
     * Create an event with only a destination object
     * @param _dst
     */
	public SimEvent(SimEntity _dst) {
        type = 0;
        time = 0;
        src = null;
        dst = _dst;        
    }
    
    /**
     * Create an event with time and destination object
     * @param _time
     * @param _dst
     */
	public SimEvent(double _time, SimEntity _dst) {
        type = 0;
		time = _time;
        src = null;
        dst = _dst;
	}
    
    /**
     * Create an event with destination and source object
     * @param _dst
     * @param _src
     */
    public SimEvent(SimEntity _dst, SimEntity _src) {        
        type = 0;
        src = _src;
        dst = _dst;
    }    
    	
    /**
     * Create an event with time, source object and destination object
     * @param _time
     * @param _src
     * @param _dst
     */
	public SimEvent(double _time, SimEntity _dst, SimEntity _src) {
        type = 0;
		time = _time;
		src = _src;
		dst = _dst;
	}
		
	/**
     * Returns the event time
     * @return  
     */
	public double getTime() {
		return time;
	}
	
	/**
     * Set the event time 
     * @param _time  
     */
	public void setTime(double _time) {
	    time = _time;
	}
	
	/**
     * Return the event type.
     * @return  
     */
	public int getType() {
	    return type;
	}
	
	/**
     * Set event type
     * @param _type  
     */
	public void setType(int _type) {
	    type = _type;
	}
 	
    /**
     * Return source object of the event
     * @return
     */
	public SimEntity getSource() {
		return src;
	}
	
    /**
     * Set source object of this event
     * @param _src
     */
	public void setSource(SimEntity _src) {
	    src = _src;
	}
	
    /**
     * Return destination object of this event
     * @return
     */
	public SimEntity getDestination() {
		return dst;
	}
	
    /**
     * Set destination object of this event
     * @param _dst
     */
	public void setDestination(SimEntity _dst) {
	    dst = _dst;
	}
	
    /**
     * Return a string representation of this event
     */
	public String toString() {
		return "" + time + " " + src.toString() + " " + dst.toString() + " " + type;
	}
}
