package lab3_task1;

/**
 * An objects of class Passenger represents an elevator passenger.
 * @author Maria Khismatullova
 */
public class Passenger {
    /** Floor, where the passenger is currently waiting at, in [1..n].*/
    private int currentFloor;
    /** Desired direction, where true is up, false - down. */
    private boolean direction;
    /** Floor, where the passenger is going to, if up - in [currentFloor+1..n], if down - in [1..currentFloor-1]. */
    private int destinationFloor;
    
    /** Constructor: an instance with current floor, direction and destination.
     * @param currentFloor the floor, where passenger is waiting, in [1..n].
     * @param direction the desired direction, true for up, false for down.
     * @param destinationFloor the destination floor, if direction is up must be in [currentFloor+1..n], if down - in [1..currentFloor-1].
     */
    public Passenger(int currentFloor, boolean direction, int destinationFloor) {
	this.currentFloor = currentFloor;
	this.direction = direction;
	this.destinationFloor = destinationFloor;
    }
    
    /** Return the floor, where the passenger is currently waiting at.
     * @return current floor, in [1..n].
     */
    public int getCurrentFloor() {
	return currentFloor;
    }
    /** Return the desired direction.     
     * @return direction of the passenger, true for up, false for down.
     */
    public boolean getDirection() {
	return direction;
    }
    /** Return the floor, where the passenger is going to.    
     * @return destination floor, in [1..n].
     */
    public int getDestinationFloor() {
	return destinationFloor;
    }
    
    /** Set the floor, where the passenger will be waiting at.     
     * @param currentFloor the new floor to wait at, in [1..n].
     */
    public void setCurrentFloor(int currentFloor) {
	this.currentFloor = currentFloor;
    }
    /** Set the direction for the passenger to head to.
     * @param direction true to head up, false to head down.
     */
    public void setDirection(boolean direction) {
	this.direction = direction;
    }
    /** Set the floor, where the passenger will go to.     
     * @param destinationFloor the new floor to go to, if heading up must be in [currenFloor+1..n], if heading down - in [1..currentFloor-1].
     */
    public void setDestinationFloor(int destinationFloor) {
	this.destinationFloor = destinationFloor;
    }
}
