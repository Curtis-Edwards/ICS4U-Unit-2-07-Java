/*
* This is the Vehicle class.
*
* @author  Curtis Edwards
* @version 1.0
* @since   2024-04-18
*/

/**
* This is the Vehicle class.
*/
public class Vehicle {
    // variables
    private String color;
    private final int maxSpeed;
    protected  int speed;

    /*
     * Constructor.
     */
    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    /*
     * Gets the color.
     */
    public String getColor() {
        return color;
    }

    /*
     * Gets the speed.
     */
    public int getSpeed() {
        return speed;
    }

    /*
     * Gets the max speed.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /*
     * Sets the color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /*
     * The status method.
     */
    public void status() {
        System.out.println(" -> Speed: " + speed);
        System.out.println(" -> Max Speed: " + maxSpeed);
        System.out.println(" -> Color: " + color);
    }

    /*
     * The accelerate method.
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        speed = (accelerationPower * accelerationTime) + speed;
        // check if speed exceeds max speed
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    /*
     * The break method.
     */
    public void brake(int brakePower, int brakeTime) {
        speed = speed - (brakePower * brakeTime);
        // check if speed is less than 0, because speed can't be negative!
        if (speed < 0) {
            speed = 0;
        }
    }
}
