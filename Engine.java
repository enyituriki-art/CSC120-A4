
/**
 * Represents a train engine that stores fuel information and
 * provides methods to consume and refill fuel.
 */

public class Engine implements EngineRequirements {

    private FuelType fuelType;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructor for Engine.
     * @param fuelType the type of fuel the engine uses
     * @param currentFuelLevel the starting fuel level
     * @param maxFuelLevel the maximum fuel capacity
     */
    public Engine(FuelType fuelType, double currentFuelLevel, double maxFuelLevel) {
        this.fuelType = fuelType;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    /** Returns the engine's fuel type. */
    public FuelType getFuelType() {
        return this.fuelType;
    }

    /** Returns the current fuel level. */
    public double getCurrentFuelLevel() {
        return this.currentFuelLevel;
    }

    /** Returns the maximum fuel level. */
    public double getMaxFuelLevel() {
        return this.maxFuelLevel;
    }

    /** Refills the engine to maximum fuel. */
    public void refuel() {
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * Uses some fuel and prints remaining fuel.
     * @return true if the engine still has fuel and false if empty.
     */

    public Boolean go() {
    this.currentFuelLevel -= 10;

    if (this.currentFuelLevel < 0) {
        this.currentFuelLevel = 0;
    }

    System.out.println("Fuel remaining: " + this.currentFuelLevel);

    return this.currentFuelLevel > 0;
}


}
