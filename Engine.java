/**
 * Represents a train engine that stores fuel information and
 * provides methods to consume and refill fuel.
 */
public class Engine {

    private FuelType fuelType;
    private double currentFuelLevel;
    private final double maxFuelLevel;

    /**
     * Constructs an Engine with the given fuel type, current fuel, and max capacity.
     *
     * @param fuel the type of fuel the engine uses
     * @param currentFuelLevel the starting fuel level
     * @param maxFuelLevel the maximum fuel capacity
     */
    public Engine(FuelType fuel, double currentFuelLevel, double maxFuelLevel) {
        this.fuelType = fuel;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }
    /**
     * Returns the engine's fuel type.
     *
     * @return the fuel type
     */
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * Returns the current fuel level.
     *
     * @return the current fuel amount
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * Returns the maximum fuel capacity.
     *
     * @return the max fuel level
     */
    public double getMaxFuel() {
        return maxFuelLevel;
    }
    /**
     * Refills the engine to maximum fuel.
     */
    public void refuel(){
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * Uses one unit of fuel and prints remaining fuel.
     *
     * @return true if the engine still has fuel, false if empty
     */
    public boolean go(){
        if(currentFuelLevel <= 0){
            System.out.println("Out of fuel. Need a refill!");
            return false;
        }
        currentFuelLevel -= 1;
        System.out.println("Choo choo! You're left with " + currentFuelLevel + " gallons of fuel!");
        return true;
        }
    }
