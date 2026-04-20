/**
 * Represents a passenger who can board or exit a train car.
 */
public class Passenger {
    private String name;

    /**
     * Constructs a Passenger with the given name.
     *
     * @param name the passenger's name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Returns the passenger's name.
     *
     * @return the name of this passenger
     */
    public String getName() {
        return name;
    }

    /**
     * Attempts to board the given car by calling its addPassenger method.
     *
     * @param c the Car the passenger is boarding
     */

    public void boardCar(Car c){
        c.addPassenger(this);
    }

    /**
     * Attempts to exit the given car by calling its removePassenger method.
     *
     * @param c the Car the passenger is leaving
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
    }
}
