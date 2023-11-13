package cars2;

import java.util.ArrayList;

// Child class of Vehicle, will inherit all variables and methods and will use super keyword to inherit constructor.
public class SUV extends Vehicle {
private int numSeats;
private int averageNumPassangers;

    /**
     * Constructor intended to inherit that of Vehicle.
     * @param vid
     * @param f
     * @param yom
     * @param m
     * @param a
     * @return: Nothing, constructor just prepares object for use.
     */
    public SUV(String vt, String vid, String f, int yom, String m, ArrayList<String> fa, String own, boolean a, int ns, int anp) {
        super(vt, vid, f, yom, m, fa, own, a);
        numSeats = ns;
        averageNumPassangers = anp;
    }

    /** Accessor method
     * @return int
     */
    public int getNumSeats() 
    {
        return numSeats;
    }

    /** Accessor method
     * @return int
     */
    public int getAverageNumPassangers() 
    {
        return averageNumPassangers;
    }
}
