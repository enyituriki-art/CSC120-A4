
import java.util.ArrayList;

/**
 * Represents a train car that stores passengers and enforces
 * a maximum seating capacity.
 */

public class Car implements CarRequirements {

    private ArrayList<Passenger> passengers;
    private int maxCapacity;

    /**
     * Constructor for Car.
     * @param maxCapacity the maximum number of passengers allowed
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>();
    }

    /** Returns the maximum capacity of the car. */
    public int getCapacity() {
        return this.maxCapacity;
    }

    /** Returns how many seats are still open. */
    public int seatsRemaining() {
        return this.maxCapacity - this.passengers.size();
    }

    /**
     * Attempts to add a passenger.
     * @param p the passenger to add
     * @return true if successful and false if car is full.
     */
    public Boolean addPassenger(Passenger p) {
        if (this.passengers.size() < this.maxCapacity) {
            this.passengers.add(p);
            return true;
        }
        return false;
    }

    /**
     * Attempts to remove a passenger.
     * @param p the passenger to remove
     * @return true if successful and false if passenger was not found.
     */
    public Boolean removePassenger(Passenger p) {
        if (this.passengers.contains(p)) {
            this.passengers.remove(p);
            return true;
        }
        return false;
    }

    /** Prints the list of passengers or a message if empty. */
    public void printManifest() {
        if (this.passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
        } else {
            for (Passenger p : this.passengers) {
                System.out.println(p.getName());
            }
        }
    }
}
