package cars2;

import java.util.ArrayList;

public class Owner {
    private String ownerID;
    private String name;
    private String homeAddress;
    private String emailAddress;
    private ArrayList<String> ownedVehicles;

    /**
     * Constructor method prepares the object by initialising variables.
     * @param a: String
     * @param b: String
     * @param c: String
     * @param d: String
     * @return: Nothing, method just prepares object for use.
     */
    public Owner(String oid, String n, String ha, String ea) {
        ownerID = oid;
        name = n;
        homeAddress = ha;
        emailAddress = ea;
        ownedVehicles = new ArrayList<String>();
    }

    /**
     * Accessor method
     * @param a: none
     * @return: String
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Accessor method
     * @param a: none
     * @return: String
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method
     * @param a: none
     * @return: String
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * Accessor method
     * @param a: none
     * @return: String
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Accessor method.
     * @param a: None
     * @return: ArrayList of vehicle IDs
     */
    public ArrayList<String> getOwnedVehicles() {
        return ownedVehicles;
    }
}
