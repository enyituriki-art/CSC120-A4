public class Main {
    public static void main(String[] args) {

        // Make a train with:
        // fuel type, current fuel, max fuel, number of cars, capacity per car
        Train t = new Train(FuelType.ELECTRIC, 50.0, 100.0, 3, 2);

        // Test engine
        System.out.println("Testing engine:");
        t.getEngine().go();
        t.getEngine().go();
        t.getEngine().refuel();
        System.out.println("Fuel after refuel: " + t.getEngine().getCurrentFuelLevel());

        // Make some passengers
        Passenger p1 = new Passenger("Alice");
        Passenger p2 = new Passenger("Bob");
        Passenger p3 = new Passenger("Charlie");

        // Board passengers
        System.out.println("\nBoarding passengers:");
        p1.boardCar(t.getCar(0));
        p2.boardCar(t.getCar(0));
        p3.boardCar(t.getCar(1));

        // Print manifest
        System.out.println("\nFull Train Manifest:");
        t.printManifest();

        // Remove a passenger
        System.out.println("\nRemoving Bob from Car 0:");
        p2.getOffCar(t.getCar(0));

        // Print manifest again
        System.out.println("\nUpdated Train Manifest:");
        t.printManifest();
    }
}
