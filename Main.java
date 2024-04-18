/*
* This is the main code that runs with the Vehicle Class.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-04-13
*/

/**
* This is the Main class.
*/
final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException if instantiation is attempted
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        Bike bmx = new Bike("Red", 40);

        System.out.println("Created Bmx bike.\nStatus:\n");
        bmx.status();

        System.out.println("Set the cadence to 10\n");
        bmx.setCadence(10);
        bmx.status();

        System.out.println("\nAccelerate by 15:");
        bmx.accelerate(15);
        bmx.status();

        System.out.println("\nRing bell.");
        bmx.ringBell();


        Truck bigTruck = new Truck("Grey", 200, "HGC-3456F");

        System.out.println("Created a Truck.\nStatus:\n");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(10, 10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        bigTruck.accelerate(10, 10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nApplied air pressure of 10:");
        bigTruck.applyAir(10);
        System.out.println("New speed: " + bigTruck.getSpeed());

        System.out.println("\nDone.");
    }
}
