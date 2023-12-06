package cars2;

import java.util.ArrayList;

public class Software extends Fault {
private boolean runTime;
private double numLinesInClass;
private boolean majorOrMinor;
private String severity;

    /**
     * Constructor intended to inherit that of Fault.
     * @param fid
     * @param s
     * @param ts
     * @param tc
     * @return: Nothing, constructor just prepares object for use.
     */
    public Software(String ft, String fid, String s, String ts, String tc, ArrayList<String> v, boolean a, boolean rt, double nlic, boolean mom, String se) {
        super(ft, fid, s, ts, tc, v, a);
        runTime = rt;
        numLinesInClass = nlic;
        severity = se;
        //TODO Auto-generated constructor stub
    }
    
    /** Accessor method, if method is false the error can only be a logic error, as a syntax error would mean that the car would never make it to the public.
     * @return boolean
     */
    public boolean isRuntime() 
    {
        return runTime;
    }

    /** Accessor method
     * @return int
     */
    public double getNumLinesInClass() 
    {
        return numLinesInClass;
    }

    /** Accessor method
     * @return boolean
     */
    public boolean isMajorOrMinor() 
    {
        return majorOrMinor;
    }

    /** Accessor method
     * @return String
     */
    public String getSeverity() 
    {
        return severity;
    }
}
