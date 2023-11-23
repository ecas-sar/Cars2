package cars2;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SubSystem {

    private String subID;
    private String subSystemName;
    private ArrayList<String> faultsInThisSubSystem;

    /**
     * Constructor method prepares the object by initialising variables.
     * @param a: String
     * @return: Nothing, method just prepares object for use.
     */
    public SubSystem(String sid, String ssn) {
        subID = sid;
        subSystemName = ssn;
        faultsInThisSubSystem = new ArrayList<String>();
    }
 
    /** Accessor method
     * @return String
     */
    public String getSubID() {
        return subID;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: String
     */
    public String getSubSystemName() {
        return subSystemName;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: Arraylist of fault IDs.
     */
    public ArrayList<String> getFaultsInThisSubSystem() {
        return faultsInThisSubSystem;
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
