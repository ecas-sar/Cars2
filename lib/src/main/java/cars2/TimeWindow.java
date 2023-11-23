package cars2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeWindow {
    private String timeStarted;
    private String timeCleared;
    private String time1970;
    private transient LocalDateTime dateStarted;
    private transient LocalDateTime dateCleared;
    private transient LocalDateTime date1970;
    private transient Duration duration;
    

    /**
     * Constructor method intended to prepare timeWindow object by initialising
     * variables.
     * @param a: String
     * @param b: String
     * @return: Nothing, method just prepares object.
     */
    public TimeWindow(String ts, String tc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        timeStarted = ts;
        timeCleared = tc;
        time1970 = "1970-01-01T00:00:00";
        
        dateStarted = LocalDateTime.parse(ts, formatter);
        dateCleared = LocalDateTime.parse(tc, formatter);
        date1970 = LocalDateTime.parse(time1970, formatter);

        duration = Duration.between(dateStarted, dateCleared);
    }

    /**
     * Accessor method
     * @param a: None
     * @return: String
     */
    public String getTimeStarted() {
        return timeStarted;
    }

    /**
     * Accessor method
     * @param a: None
     * @return: String
     */
    public String getTimeCleared() {
        return timeCleared;
    }
 
    /** Method intended to calculate how much time was in this time window in HH:MM:SS form.
     * 
     * @return time in window as string in HH:MM:SS form
     */
    public String totalTimeInWindowInHoursMinutesSeconds()
    {
        long HH = duration.toHours();
        long MM = duration.toMinutesPart();
        long SS = duration.toSecondsPart();
        return String.format("%02d:%02d:%02d", HH, MM, SS);
    }

    /** Method intended to calculate how many days were in this time window. 
     * 
     * @return time in window
     */
    public long totalTimeInWindow()
    {
        long daysInDuration = duration.toDays();
        return daysInDuration;
    }

    /** Method intended to return how many seconds since 1970 the fault arose.
     * @return long
     */
    public long secondsStartedSince1970()
    {
        Duration since1970 = Duration.between(date1970, dateStarted);
        long secondsSince1970 = since1970.toSeconds();
        return secondsSince1970;
    }

    /** Method intended to return how many seconds since 1970 the fault was fixed.
     * @return Duration
     */
    public long secondsClearedSince1970()
    {
        Duration since1970 = Duration.between(date1970, dateCleared);
        long secondsSince1970 = since1970.toSeconds();
        return secondsSince1970;
    }
}