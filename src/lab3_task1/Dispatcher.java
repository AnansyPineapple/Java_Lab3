package lab3_task1;

import java.util.*;
import java.util.concurrent.*;

/**
 * An objects of class Dispatcher represents a system, managing the work of elevators inside one house.
 * @author Maria Khismatullova
 */
public class Dispatcher {
    /** Number of elevators in the house. */
    private int elevators;
    /** Number of floors in the house. */
    private int floors;
    /** Capacity of each elevator. */
    private int capacity;
    
    /** Queue of passenger requests */
    BlockingQueue<Passenger> jobQueue = new ArrayBlockingQueue<Passenger>(floors);
    
    /** Constructor: an instance with the number of elevators.  
     * @param elevators the number of elevators the dispatcher is managing.
     * @param floors the number of floors in the house.
     * @param capacity capacity of each elevator.
     */
    public Dispatcher(int elevators, int floors, int capacity) {
	this.elevators = elevators;
	this.floors = floors;
	this.capacity = capacity;
    }
    
    /** Start the elevator system. */
    public void start() {
	Executor dispatcher = Executors.newFixedThreadPool(elevators);
	
	for (int i = 0; i < elevators; i++) {
	    Elevator e = new Elevator(capacity);
	    dispatcher.execute(e);
	}
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int k = sc.nextInt();
	sc.close();
	Dispatcher d = new Dispatcher(m,n,k);
	d.start();
    }
}
