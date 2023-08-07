package cars2;

import java.util.ArrayList;

public class Mechanical extends Fault {

    /**
     * Constructor intended to inherit that of Fault.
     * @param fid
     * @param s
     * @param ts
     * @param tc
     * @return: Nothing, constructor just prepares object for use.
     */
    public Mechanical(String ft, String fid, String s, String ts, String tc, ArrayList<String> v) {
        super(ft, fid, s, ts, tc, v);
        //TODO Auto-generated constructor stub
    }
}
