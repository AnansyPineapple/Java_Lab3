package lab3_task1;

import java.util.concurrent.*;

/**
 * An objects of class Elevator represents a single elevator.
 * @author Maria Khismatullova
 */
public class Elevator implements Runnable {
    /** Number of passengers the elevator can fit in. */
    private int capacity;
    
    /** Elevator movement order */
    PriorityBlockingQueue<Passenger> movementOrder = new PriorityBlockingQueue<Passenger>(capacity);
    
    /** Constructor: an instance with capacity.     
     * @param capacity the number of passengers the elevator can fit in.
     */
    public Elevator(int capacity) {
	this.capacity = capacity;
    }
    
    
    @Override
    public void run() {
	// TODO Auto-generated method stub
	System.out.println("Elevator is working!! Capacity is " + capacity);
    }
    
}
