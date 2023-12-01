package cars2;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Fault
{
    private String faultType;
    private String faultID;
    private String subSystemName;
    private TimeWindow timeWindow;
    private ArrayList<String> vehicles;
    private boolean active;

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
        createTimeWindow(ts, tc);
        vehicles = v;
        active = a;
    }
    

    /** Method intended to make time window from start and clear times. 
     * Done in its own method so it can be called in post processing in list creator and this constructor.
     * @param ts
     * @param tc
     */
    public void createTimeWindow(String ts, String tc)
    {
        timeWindow = new TimeWindow(ts, tc);
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

    /** Method intended to return whether or not this fault is in a given time window. 
     * @param timeWindow
     * @return boolean
     */
    public boolean inTimeWindow(TimeWindow timeWindow)
    {
        boolean inTimeWindow = false;
        long timeWindowSecondsStartedSince1970 = timeWindow.secondsStartedSince1970();
        long timeWindowSecondsClearedSince1970 = timeWindow.secondsClearedSince1970();
        long faultSecondsStartedSince1970 = this.timeWindow.secondsStartedSince1970();
        long faultSecondsClearedSince1970 = this.timeWindow.secondsClearedSince1970();
        if (faultSecondsStartedSince1970 >= timeWindowSecondsStartedSince1970 && faultSecondsClearedSince1970 <= timeWindowSecondsClearedSince1970)
        {
            inTimeWindow = true;
        }
        return inTimeWindow;
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
