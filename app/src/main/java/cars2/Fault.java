package cars2;

import java.util.ArrayList;

public class Fault
{
    private String faultType;
    private String faultID;
    private String subSystemName;
    private TimeWindow timeWindow;
    private boolean active;

    private ArrayList<String> vehicles;

    /** Constructor method prepares the object by initialising variables.
        @param a: String
        @param b: String
        @param c: String
        @param d: String
        @param e: String
        @param f: Arraylist
        @return: Nothing, method just prepares object for use.  
    */ 
    public Fault(String ft, String fid, String s, String ts, String tc, ArrayList<String> v, boolean a)
    {
        faultType = ft;
        faultID = fid;
        subSystemName = s;
        timeWindow = new TimeWindow(ts, tc);
        active = a;
        vehicles = v;
    }
    
    /** Accessor method.
        @param a: None
        @return: String
    */
    public String getFaultType()
    {
        return faultType;
    }

    /** Accessor method.
        @param a: None
        @return: String
    */ 
    public String getFaultID()
    {
        return faultID;
    }

    /** Accessor method.
        @param a: None
        @return: String
    */ 
    public String getSubSystemName()
    {
        return subSystemName;
    }

    /** Setter method.
     * @param s
     */
    public void setSubSystemName(String s)
    {
        subSystemName = s;
    }

    /** Accessor method.
        @param a: None
        @return: TimeWindow
    */ 
    public TimeWindow getTimeWindow()
    {
        return timeWindow;
    }
    
     /** Accessor method. Will return details of all vehicles as well. 
        @param a: None
        @return: Arraylist of vehicle IDs
    */ 
    public ArrayList<String> getVehicles()
    {
        return vehicles;
    }


    /** Accessor method.
     * @return boolean
     */
    public boolean getActive() 
    {
        return active;
    }

    /** Method intended to add a vehicle to the list of vehicles.  
    *  Vehicle type here is just an extra detail and they will all be added to the same list. 
    *      @param a: String
    *      @param b: String
    *      @param c: String
    *      @param d: int
    *      @param e: String
    *      @param f: boolean
    *      @return: Nothing, method just adds vehicle to the list.    
    */ 
    public void addVehicle(String vehicleType, String vehicleID, String factory, int yearOfManufacture, String model, boolean active)
    {

    }
}
