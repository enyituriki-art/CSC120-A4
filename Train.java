import java.util.ArrayList;

/**
 * Represents a train composed of an engine and multiple passenger cars.
 */
public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructs a Train with an engine and a number of cars.
     *
     * @param fuelType the type of fuel the engine uses
     * @param currentFuel the starting fuel level
     * @param nCars the number of cars in the train
     * @param passengerCapacity the capacity of each car
     */
    public Train(FuelType fuelType, double currentFuel, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, currentFuel, currentFuel);
        this.cars = new ArrayList<>();

        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Returns the train's engine.
     *
     * @return the Engine object
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Returns the car at the given index.
     *
     * @param i the index of the car
     * @return the Car at index i
     */
    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * Returns the total maximum capacity of all cars.
     *
     * @return the combined seating capacity
     */
    public int getMaxCapacity() {
        int total = 0;
        for (Car c : cars) {
            total += c.getCarCapacity();
        }
        return total;
    }

    /**
     * Returns the total number of empty seats across all cars.
     *
     * @return the number of remaining seats
     */
    public int seatsRemaining() {
        int total = 0;
        for (Car c : cars) {
            total += c.seatsRemaining();
        }
        return total;
    }

    /**
     * Prints the passenger manifest for each car.
     */
    public void printManifest() {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i + ":");
            cars.get(i).printManifest();
        }
    }
}
