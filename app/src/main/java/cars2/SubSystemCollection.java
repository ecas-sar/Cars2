package cars2;

import java.util.ArrayList;
import java.util.HashMap;

public class SubSystemCollection
{
    private HashMap<String, SubSystem> subSystemCollection;
    private ArrayList<SubSystem> s;

    /** Constructor method intended to initialise subSystemCollection.
     * @param a: none.
     * @return Nothing, just prepares object for use. 
     */
    public SubSystemCollection(ListCreator l)
    {
        s = l.createList("SubSystemArchive", SubSystem.class);
        subSystemCollection = createCollection(s);
    }

    /** Method intended to create hashmap. 
     * @param s
     * @return hashmap with keys correctly formed. 
     */
    public HashMap<String, SubSystem> createCollection(ArrayList<SubSystem> s){
        HashMap<String, SubSystem> sc = new HashMap<String, SubSystem>();
        for (int SubSystemIndex = 0; SubSystemIndex < s.size(); SubSystemIndex++)
        {
            SubSystem sub = s.get(SubSystemIndex);
            sc.put(sub.getSubID(), sub);
        }
        return sc;
    }

    /** Accessor method
     * 
     * @return subSystemCollection
     */
    public HashMap<String, SubSystem> subSystemCollection()
    {
        return subSystemCollection;
    }

    public static SubSystem get(String getfirstID) {
        return null;
    }
}