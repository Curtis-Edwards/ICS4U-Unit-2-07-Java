/*
* This is the Bike class.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-04-18
*/

/**
* This is the Bike class.
*/
public class Bike extends Vehicle {
    // variables
    private int cadence;

    /*
     * Constructor.
     */
    public Bike(String color, int maxSpeed) {
        super(color, maxSpeed);
        this.cadence = 0;
    }

    /*
     * Gets the cadence.
     */
    public int getCadence() {
        return cadence;
    }

    /*
     * Sets the cadence.
     */
    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    /*
     * The status method.
     */
    public void status() {
        super.status();
        System.out.println(" -> Cadence: " + cadence);
    }

    /*
     * The accelerate method.
     */
    public void accelerate(int appliedPower) {
        cadence = cadence + appliedPower;
    }

    /*
     * The ringBell method.
     */
    public void ringBell() {
        System.out.println("Ding ding!\n");
    }
}
