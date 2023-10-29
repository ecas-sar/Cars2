package cars2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeWindow {
    private String timeStarted;
    private String timeCleared;
    private LocalDateTime dateStarted;
    private LocalDateTime dateCleared;
    private Duration duration;
    

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
        
        dateStarted = LocalDateTime.parse(ts, formatter);
        dateCleared = LocalDateTime.parse(tc, formatter);

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

    /** Method intended to calculate how much time was in this time window. Will only return the value that is
     * greater than 0, as it is less useful for the clients to see that a time window lasted 0.6 years than that 
     * it lasted 2 months.
     * 
     * @return time in window
     */
    public Duration totalTimeInWindow()
    {
        return duration;
    }

}