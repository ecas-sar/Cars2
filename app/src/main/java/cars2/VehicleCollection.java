package cars2;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleCollection {
    private HashMap<String, Vehicle> vehicleCollection;
    private ArrayList<Vehicle> v;
    
    /** Constructor method intended to initialise vehicleCollection.
     * @param a: none.
     * @return Nothing, just prepares object for use. 
     */
    public VehicleCollection(ListCreator l) {
        v = l.createList("VehicleArchive", Vehicle.class);
        vehicleCollection = createCollection(v);
    }

    /** Method intended to create hashmap. 
     * @param v
     * @return hashmap with keys correctly formed. 
     */
    public HashMap<String, Vehicle> createCollection(ArrayList<Vehicle> v){
        HashMap<String, Vehicle> vc = new HashMap<String, Vehicle>();
        for (int vehicleIndex = 0; vehicleIndex < v.size(); vehicleIndex++)
        {
            Vehicle veh = v.get(vehicleIndex);
            vc.put(veh.getVehicleID(), veh);
        }
        return vc;
    }
    
    /** Accessor method
     * 
     * @return vehicleCollection
     */
    public HashMap<String, Vehicle> vehicleCollection()
    {
        return vehicleCollection;
    }

    public static Vehicle get(String getsecondID) {
        return null;
    }
}