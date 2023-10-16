package cars2;

import java.util.ArrayList;

// Child class of Vehicle, will inherit all variables and methods and will use super keyword to inherit constructor.
public class Van extends Vehicle {
private double maxCargoMass;
private double averageCargoPerDay;
private double storageVolume;

    /**
     * Constructor intended to inherit that of Vehicle.
     * @param vid
     * @param f
     * @param yom
     * @param m
     * @param a
     * @return: Nothing, constructor just prepares object for use.
     */
    public Van(String vt, String vid, String f, int yom, String m, ArrayList<String> fa, boolean a, double mcm, double acpd, double sv) 
    {
        super(vt, vid, f, yom, m, fa, a);
        maxCargoMass = mcm;
        averageCargoPerDay = acpd;
        storageVolume = sv;
    }

    /** Accessor method
     * @return double
     */
    public double getMaxCargoMass() 
    {
        return maxCargoMass;
    }

    /** Accessor method
     * @return double
     */
    public double getAverageCargoPerDay() 
    {
        return averageCargoPerDay;
    }

    /** Accessor methods
     * @return double
     */
    public double getStorageVolume() 
    {
        return storageVolume;
    }
}
