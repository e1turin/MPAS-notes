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
 * This class implements the interface of an entity in the simulation world.
 * Entities are sources and destinations of events.
 * @author  Mesut Günes
 * @see  core.SimEvent
 */
public abstract class SimEntity {
    /**
     * Human readable name of this entity for debug purposes
     */
    String name;
    
    /** 
     * simControl provides access to the current simulator instance 
     */
	protected SimControl simControl;    
	
	/**
	 * An entity has to know the current instance of the simulator.
	 * @param _simControl
	 * @see SimControl
	 */
	public SimEntity() {
        simControl = SimControl.simulator;
        name = "";
	}
    
    public SimEntity(String _name) {
        this();
        name = _name;
    }
    
    public void setName(String _name) {
        name = _name;
    }
    
    public String getName(String _name) {
        return name;
    }
    
    public String toString() {
        return name;
    }
	
	/**
	 * This method handles the events destined to this entity.
	 * @param event
	 * @see SimEvent
	 */
	abstract public void handleEvent(SimEvent event);
}
