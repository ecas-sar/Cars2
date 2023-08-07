package cars2;

import java.util.ArrayList;
import java.util.HashMap;

public class FaultCollection
{
    private HashMap<String, Fault> faultCollection;
    private ArrayList<Fault> f;

    /** Constructor method intended to initialise faultCollection.
     * @param a: none.
     * Output: Nothing, just prepares object for use. 
     */
    public FaultCollection(ListCreator l) {
        f = l.createList("FaultArchive", Fault.class);
        faultCollection = createCollection(f);
    }

     /** Method intended to create hashmap. 
     * @param f
     * @return hashmap with keys correctly formed. 
     */
    public HashMap<String, Fault> createCollection(ArrayList<Fault> f){
        HashMap<String, Fault> fc = new HashMap<String, Fault>();
        for (int faultIndex = 0; faultIndex < f.size(); faultIndex++)
        {
            Fault fau = f.get(faultIndex);
            fc.put(fau.getFaultID(), fau);
        }
        return fc;
    }

    /** Accessor method
     * 
     * @return faultCollection
     */
    public HashMap<String, Fault> faultCollection()
    {
        return faultCollection;
    }

    public static Fault get(String getfirstID) {
        return null;
    }
}