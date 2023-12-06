package cars2;

import java.util.ArrayList;

public class Electrical extends Fault{
private double modulePartNumber;
private double numModulesAffected;
private String DBCForOBT;

    /**
     * Constructor intended to inherit that of Fault.
     * @param fid
     * @param s
     * @param ts
     * @param tc
     * @return: Nothing, constructor just prepares object for use.
     */
    public Electrical(String ft, String fid, String s, String ts, String tc, ArrayList<String> v, boolean a, double mpn, double nma, String d) {
        super(ft, fid, s, ts, tc, v, a);
        modulePartNumber = mpn;
        numModulesAffected = nma;
        DBCForOBT = d;
        //TODO Auto-generated constructor stub
    }
    
    /** Accessor method
     * @return int
     */
    public double getModulePartNumber() 
    {
        return modulePartNumber;
    }

    /** Accessor method.
     * @return int
     */
    public double getNumModulesAffected()
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