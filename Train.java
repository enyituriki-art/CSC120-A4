//public class Train {

//}

import java.util.ArrayList;

/**
 * Represents a train composed of an engine and multiple cars.
 * Provides methods to access cars, check capacity, and print a full manifest.
 */


public class Train implements TrainRequirements {

    private Engine engine;
    private ArrayList<Car> cars;

    /**
     * Constructor for Train.
     * @param fuelType the type of fuel the engine uses
     * @param currentFuelLevel the starting fuel level
     * @param fuelCapacity the maximum fuel capacity
     * @param nCars number of cars to attach
     * @param passengerCapacity capacity of each car
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity,
                 int nCars, int passengerCapacity) {

        this.engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);

        this.cars = new ArrayList<Car>();
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
    }

    /** Returns the engine. */
    public Engine getEngine() {
        return this.engine;
    }

    /**
 * Returns the car at the given index.
 * @param i the index of the car
 * @return the requested car
 */

    public Car getCar(int i) {
        return this.cars.get(i);
    }

    /** Returns total maximum capacity across all cars. */
    public int getMaxCapacity() {
        int total = 0;
        for (Car c : this.cars) {
            total += c.getCapacity();
        }
        return total;
    }

    /** Returns total remaining seats across all cars. */
    public int seatsRemaining() {
        int total = 0;
        for (Car c : this.cars) {
            total += c.seatsRemaining();
        }
        return total;
    }

    /** Prints a full manifest of all passengers on the train. */
    public void printManifest() {
        System.out.println("TRAIN MANIFEST:");

        for (int i = 0; i < this.cars.size(); i++) {
            System.out.println("Car " + i + ":");
            this.cars.get(i).printManifest();
            System.out.println();
        }
    }
}

