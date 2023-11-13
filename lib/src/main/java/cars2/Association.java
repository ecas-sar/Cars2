package cars2;

public class Association {
    private String firstID;
    private String secondID;

    /** Constructor method intended to give time window and ids to be compared. 
     * 
     * @param tw
     * @param fid
     */
    public Association(String fid, String sid) {
        firstID = fid;
        secondID = sid;
    }

    /** Accessor method.
        @param a: None
        @return: String
    */ 
    public String getfirstID() {
        return firstID;
    }

    /** Accessor method.
        @param a: None
        @return: String
    */
    public String getsecondID() {
        return secondID;
    }
}
