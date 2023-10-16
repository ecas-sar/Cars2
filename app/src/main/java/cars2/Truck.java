package cars2;

import java.util.ArrayList;

// Child class of Vehicle, will inherit all variables and methods and will use super keyword to inherit constructor.
public class Truck extends Vehicle {
private double maxMassInBack;
private double averageMassPerDay;

    /**
     * Constructor intended to inherit that of Vehicle.
     * @param vid
     * @param f
     * @param yom
     * @param m
     * @param a
     * @return: Nothing, constructor just prepares object for use.
     */
    public Truck(String vt, String vid, String f, int yom, String m, ArrayList<String> fa, boolean a, double mmib, double ampd) {
        super(vt, vid, f, yom, m, fa, a);
        maxMassInBack = mmib;
        averageMassPerDay = ampd;
    }

    /** Accessor method
     * @return double
     */
    public double getMaxMassInBack() 
    {
        return maxMassInBack;
    }

    /** Accessor method
     * @return double
     */
    public double getAverageMassPerDay() 
    {
        return averageMassPerDay;
    }
}
