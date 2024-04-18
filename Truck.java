/*
* This is the Truck class.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-04-18
*/

/**
* This is the Truck class.
*/
public class Truck extends Vehicle {
    // variables
    private String licensePlateNumber;

    /*
     * Constructor.
     */
    public Truck(String color, int maxSpeed, String licensePlateNumber) {
        super(color, maxSpeed);
        this.licensePlateNumber = licensePlateNumber;
    }

    /*
     * Gets the LicensePlateNumber.
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /*
     * Sets the LicensePlateNumber.
     */
    public void setLicensePlateNumber(String value) {
        this.licensePlateNumber = value;
    }

    /*
     * The status method.
     */
    public void status() {
        super.status();
        System.out.println(" -> License Plate: " + licensePlateNumber);
    }

    /*
     * The applyAir method.
     */
    public void applyAir(int airPressure) {
        speed = speed - airPressure / 2;
    }
}
