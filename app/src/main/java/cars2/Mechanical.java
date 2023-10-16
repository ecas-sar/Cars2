package cars2;

import java.util.ArrayList;

public class Mechanical extends Fault {
private String systemName;
private int partNumber;
private String failureType;

    /**
     * Constructor intended to inherit that of Fault.
     * @param fid
     * @param s
     * @param ts
     * @param tc
     * @return: Nothing, constructor just prepares object for use.
     */
    public Mechanical(String ft, String fid, String s, String ts, String tc, ArrayList<String> v, String sn, int pn, String fty) {
        super(ft, fid, s, ts, tc, v);
        systemName = sn;
        partNumber = pn;
        failureType = fty;
        //TODO Auto-generated constructor stub
    }

    /** Accessor method
     * @return String
     */
    public String getSystemName() 
    {
        return systemName;
    }

    /** Accessor method
     * @return int
     */
    public int getPartNumber() 
    {
        return partNumber;
    }

    /** Accessor method
     * @return String
     */
    public String getFailureType() 
    {
        return failureType;
    }
}
