package cars2;

import java.util.ArrayList;

// Child class of Vehicle, will inherit all variables and methods and will use super keyword to inherit constructor.
public class SUV extends Vehicle {

    /**
     * Constructor intended to inherit that of Vehicle.
     * @param vid
     * @param f
     * @param yom
     * @param m
     * @param a
     * @return: Nothing, constructor just prepares object for use.
     */
    public SUV(String vt, String vid, String f, int yom, String m, ArrayList<String> fa, boolean a) {
        super(vt, vid, f, yom, m, fa, a);
    }
}
