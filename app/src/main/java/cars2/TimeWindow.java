package cars2;

public class TimeWindow {
    private String timeStarted;
    private String timeCleared;

    /**
     * Constructor method intended to prepare timeWindow object by initialising
     * variables.
     * @param a: String
     * @param b: String
     * @return: Nothing, method just prepares object.
     */
    public TimeWindow(String ts, String tc) {
        timeStarted = ts;
        timeCleared = tc;
    }

    /**
     * Accessor method
     * @param a: None
     * @return: String
     */
    public String timeStarted() {
        return timeStarted;
    }

    /**
     * Accessor method
     * @param a: None
     * @return: String
     */
    public String timeCleared() {
        return timeCleared;
    }
}
