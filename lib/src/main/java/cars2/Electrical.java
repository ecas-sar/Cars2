package cars2;

import java.util.ArrayList;

public class Electrical extends Fault{
private int modulePartNumber;
private int numModulesAffected;
private String DBCForOBT;

    /**
     * Constructor intended to inherit that of Fault.
     * @param fid
     * @param s
     * @param ts
     * @param tc
     * @return: Nothing, constructor just prepares object for use.
     */
    public Electrical(String ft, String fid, String s, String ts, String tc, ArrayList<String> v, boolean a, int mpn, int nma, String d) {
        super(ft, fid, s, ts, tc, v, a);
        modulePartNumber = mpn;
        numModulesAffected = nma;
        DBCForOBT = d;
        //TODO Auto-generated constructor stub
    }
    
    /** Accessor method
     * @return int
     */
    public int getModulePartNumber() 
    {
        return modulePartNumber;
    }

    /** Accessor method.
     * @return int
     */
    public int getNumModulesAffected()
    {
        return numModulesAffected;
    }

    /** Accessor method.
     * @return String
     */
    public String getDBCForOBT() 
    {
        return DBCForOBT;
    }
}
