package cars2;

import java.util.ArrayList;
import java.util.HashMap;

public class OwnerCollection {
    private HashMap<String, Owner> ownerCollection;
    private ArrayList<Owner> o;

    /** Constructor method intended to initialise ownerCollection.
     * @param a: none.
     * Output: Nothing, just prepares object for use. 
     */
    public OwnerCollection(ListCreator l)
    {
        // Deserialises contents of owner archive into a list.
        o = l.createList("OwnerArchive", Owner.class);
        ownerCollection = createCollection(o);
    }

    /** Method intended to create hashmap. 
     * @param o
     * @return hashmap with keys correctly formed. 
     */
    public HashMap<String, Owner> createCollection(ArrayList<Owner> o){
        HashMap<String, Owner> oc = new HashMap<String, Owner>();
        for (int OwnerIndex = 0; OwnerIndex < o.size(); OwnerIndex++)
        {
            Owner own = o.get(OwnerIndex);
            oc.put(own.getOwnerID(), own);
        }
        return oc;
    }

    /** Accessor method
     * 
     * @return ownerCollection
     */
    public HashMap<String, Owner> ownerCollection()
    {
        return ownerCollection;
    }

    public static Owner get(String getfirstID) {
        return null;
    }
}
