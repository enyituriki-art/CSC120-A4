// public class Passenger {
    
    //private String name;

    //public Passenger(String name) {
        //this.name = name;
    //}
//}

/**
 * Represents a passenger who can board and exit train cars.
 */


public class Passenger implements PassengerRequirements {

    private String name;

    /**
     * Constructor for Passenger.
     * @param name the passenger's name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /** Returns the passenger's name. */
    public String getName() {
        return this.name;
    }

    /**
     * Attempts to board the given car.
     * @param c the car to board
     * @return true if successful, false if the car is full.
     */
    public void boardCar(Car c) {
        boolean boarded = c.addPassenger(this);
        if (!boarded) { 
            System.out.println(this.name + " could not board; car is full."); 
        }
        
    }

    /**
     * Attempts to get off the given car.
     * @param c the car to exit
     * @return true if successful, false if the passenger wasn't onboard.
     */
    public void getOffCar(Car c) {
        boolean removed = c.removePassenger(this);
        if (!removed) { 
            System.out.println(this.name + " was not on this car.");
         }
    }
}

