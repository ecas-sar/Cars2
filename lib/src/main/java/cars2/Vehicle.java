package cars2;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Vehicle {
    private String vehicleType;
    private String vehicleID;
    private String factory;
    private int yearOfManufacture;
    // Chose not to include model subclasses in order to contain project scope.
    private String model;
    private ArrayList<String> faultHistory;
    private String ownerID;
    private boolean active;

    /**
     * Constructor method prepares the object by initialising variables.
     * @param a: String
     * @param b: String
     * @param c: int
     * @param d: String
     * @param e: boolean
     * @return: Nothing, method just prepares object for use.
     */
    public Vehicle(String vt, String vid, String f, int yom, String m, ArrayList<String> fa, String own, boolean a) {
        vehicleType = vt;
        vehicleID = vid;
        factory = f;
        yearOfManufacture = yom;
        model = m;
        faultHistory = fa;
        ownerID = own;
        active = a;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return vehicleType
     */
    public String getVehicleType()
    {
        return vehicleType;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: String
     */
    public String getVehicleID() {
        return vehicleID;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: String
     */
    public String getFactory() {
        return factory;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: int
     */
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: String
     */
    public String getModel() {
        return model;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: boolean
     */
    public boolean getActive() {
        return active;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: ArrayList
     */
    public ArrayList<String> getFaultHistory() {
        return faultHistory;
    }
 
    /** Accessor method.
     * @return string
     */
    public String getOwnerID() {
        return ownerID;
    }

    /** Setter method.
     * @param ownerID
     */
    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    /**
     * Method intended to return how many average faults per time window
     * @param a: int
     * @return: the fault density in faults per time window.
     */
    public int faultDensity(TimeWindow timeWindow) {
        return 0;
    }

    /** Method intended to get the json representation of the object and not the pointer.
     * @return: String
     */
    public String toString()
    {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(this);
        return jsonString;
    }
}
