package cars2;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;

public interface dataAndStats {

    /** Method intended to return a list of data from whatever variable the client wants.
     * @param <T>
     * @param a: obj
     * @return LinkedList of data
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
    */
    public <E, T> LinkedList<T> createDataList(HashMap<String, E> dataGiver, String dataName, int numOfSamples, boolean systematic) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;

    /** Method intended to return the average value of a set of data.
     * 
     * @param data
     * @return
     */
    public double mean(LinkedList<Double> data);

    /** Method intended to return the standard deviation of a set of data.
     * 
     * @param data
     * @return
     */
    public double standardDeviation(LinkedList<Double> data);

    /** Method intended to return the median of a set of data.
     * 
     * @param data
     * @return
     */
    public double median(LinkedList<Double> data);

    /** Method intended to return the mode of a set of data. If there is no mode, output -1;
     * 
     * @param data
     * @return
     */
    public double mode(LinkedList<Double> data);
    
    /**
     * Method intended to find the correlation (r) between one set of integers (e.g. some
     * property of the vehicle) and another set of integers (e.g fault coutn data.)
     * This is assuming they are both numbers and r can be found.
     * The correlation will tell the users how much of an effect the aspect has on
     * the fault data.
     * 
     * @param a double array
     * @param b double array
     * 
     * @return The correlation (r) between aspect and faultData.
     */
    public double aspectFaultCorrelation(LinkedList<Double> dataX, LinkedList<Double> dataY);

    /** Method intended to take the data and figure out the skew.
     * 
     * @param data
     * @return coefficient of the skew
     */
    public double skew(LinkedList<Double> data);

    /** Method intended to output the regression equation for the data.
     * 
     * @param data
     * @return
     */
    public String regressionEquation(LinkedList<Double> dataX, LinkedList<Double> dataY);

    /** Method intended to remove outliers from a list. 
     * 
     * @param data
     */
    public void removeOutliers(LinkedList<Double> data);


    /** Method intended to check if a data point is an outlier.
     * @param dataPoint
     * @return
     */
    public boolean isOutlier(LinkedList<Double> data, double dataPoint);
}
