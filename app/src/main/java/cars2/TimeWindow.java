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
    

    /** Method intended to calculate how much time was in this time window.
     * @return time in window
     */
    public double totalTimeInWindow()
    {
        double yearsInTimeWindow = years(timeCleared) - years(timeStarted);
        double monthsInTimeWindow = months(timeCleared) - months(timeStarted);
        double daysInTimeWindow = days(timeCleared) - days(timeStarted);
        double hoursInTimeWindow = hours(timeCleared) - hours(timeStarted);
        double minutesInTimeWindow = minutes(timeCleared) - minutes(timeStarted);
        double[] timeUnits = {yearsInTimeWindow, monthsInTimeWindow, daysInTimeWindow, hoursInTimeWindow, minutesInTimeWindow};
        int unitIndex = 0;
        boolean unitFound = false;
        double totalTimeToReturn = 0.0;
        while (unitIndex < timeUnits.length && !unitFound)
        {
            double currentUnit = timeUnits[unitIndex];
            if (currentUnit == (int)currentUnit)
            {
                totalTimeToReturn = currentUnit;
                unitFound = true;
            }
        }
        return totalTimeToReturn;
    }

    /** Method intended to return how many years after 1970 was the given time stamp.
     * @param timeStamp
     * @return double
     */
    public double years(String timeStamp)
    {
        String timeStampString = timeStamp.substring(0, 4);
        double timeStampYear = Double.parseDouble(timeStampString);
        double timeStampDifference = timeStampYear - 1970;
        return timeStampDifference;
    }

    /** Method intended to return how many months since 1970 was the given time stamp.
     * @param timeStamp
     * @return double
     */
    public double months(String timeStamp)
    {
        double years = years(timeStamp);
        double months = years*2;
        return months;
    }

    /** Method intended to return how many days since 1970 was the given time stamp.
     * @param timeStamp
     * @return double
     */
    public double days(String timeStamp)
    {
        double months = months(timeStamp);
        // Adding up the months with 31, 30, and 28 days.
        double daysNoLeapYears = ((months*(7/12))*31) + ((months*(4/12))*30) + 28;
        // Making sure a number without the decimal point is returned without changing the data type.
        double numLeapYearsSince1970 = (years(timeStamp)/4) - ((years(timeStamp)/4)%1);
        // Since there is one new day per leap year, the number of leap years can be added to the days.
        double daysWithLeapYears = daysNoLeapYears += numLeapYearsSince1970;
        return daysWithLeapYears;
    }

    /** Method intended to return how many hours since 1970 was the given time stamp.
     * @param timeStamp
     * @return double
     */
    public double hours(String timeStamp)
    {
        double hours = days(timeStamp)*24;
        return hours;
    }

    /** Method intended to return how many minutes since 1970 was the given timeStamp.
     * @param timeStamp
     * @return double
     */
    public double minutes(String timeStamp)
    {
        double minutes = hours(timeStamp)*60;
        return minutes;
    }
}
