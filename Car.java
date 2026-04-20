import java.util.ArrayList;

/**
 * Represents a single passenger car on a train.
 */
public class Car {
    private ArrayList<Passenger> passengers;
    private int carCapacity;


    /**
     * Constructs a new Car with the given maximum capacity.
     *
     * @param capacity the maximum number of passengers allowed in this car
     */

     public Car(int capacity) {
        this.carCapacity = capacity;
        this.passengers = new ArrayList<>();
    }

    /**
     * Returns the maximum capacity of the car.
     *
     * @return the number of seats in the car
     */
    public int getCarCapacity() {
        return carCapacity;
    }

    /**
     * Returns the number of seats still available.
     *
     * @return the number of remaining open seats
     */
    public int seatsRemaining() {
        return getCarCapacity() - passengers.size();
    }

    /**
     * Attempts to add a passenger to the car.
     * The passenger is only added if there is space and they are not already onboard
     *
     * @param p the Passenger to add
     * @return true if the passenger was successfully added, false otherwise
     */

    public boolean addPassenger(Passenger p) {
        if (passengers.size() >= carCapacity) { // checks for *space* to onboard a *new* passenger
            System.out.println("Car is full");
            return false;
        }
        if (passengers.contains(p)){
            System.out.println("Passenger already onboard");
            return false;
        }
        passengers.add(p);
        return true;
    }
    /**
     * Attempts to remove a passenger from the car.
     * The passenger is only removed if they are currently onboard.
     *
     * @param p the Passenger to remove
     * @return true if the passenger was successfully removed, false otherwise
     */

    public boolean removePassenger(Passenger p) {
        if (passengers.contains(p)){ //checks if the passenger is onboard before removing them
            passengers.remove(p);
            return true;
        }else {
            System.out.println("Passenger not found.");
            return false;
        }
    }
    /**
     * Prints a list of all passengers currently in the car.
     * If the car is empty, prints "This car is EMPTY".
     */
    public void printManifest(){
        if(passengers.size() == 0) {
            System.out.println("This car is EMPTY");
            }else { 
                for (Passenger p : passengers) {
                    System.out.println(p.getName());
                }    
        }
    }
}