package cars2;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ListCreator {
    private String basePath;
    private GsonBuilder builder;
    private Gson gson;
    
    /**
     * Constructor of object initialises all of the gson builder deserialisation tools. The reason this is 
     * done here and not in the method is so that if create list has to ever be ran multiple times by any class,
     * the gson tools will only ever be initialised as many times as there are classes that use it.
     * This is less processing power for the computer and is an overall more efficient solution.
     * @param none
     * @return nothing, just prepares gson tools. 
     */
    public ListCreator()
    {
        basePath = "//Users//cassar.eddie.l//github//Cars2//Archives//";

         RuntimeTypeAdapterFactory<Vehicle> vehicleRuntimeTypeAdapterFactory = RuntimeTypeAdapterFactory
         .of(Vehicle.class, "vehicleType", true)
         .registerSubtype(SUV.class, "SUV")
         .registerSubtype(Truck.class, "Truck")
         .registerSubtype(Van.class, "Van");

         RuntimeTypeAdapterFactory<Fault> faultRuntimeTypeAdapterFactory = RuntimeTypeAdapterFactory
         .of(Fault.class, "faultType", true)
         .registerSubtype(Mechanical.class, "Mechanical")
         .registerSubtype(Electrical.class, "Electrical")
         .registerSubtype(Software.class, "Software");

         gson = new GsonBuilder().setPrettyPrinting()
                .registerTypeAdapterFactory(vehicleRuntimeTypeAdapterFactory)
                .registerTypeAdapterFactory(faultRuntimeTypeAdapterFactory)
                .create();
    }

    /**
    * Method intended to deserialise object and make into an arraylist.
    * @param a: none
    * Output: Return list to be put into hashmap.
    */
    public <T> ArrayList<T> createList(String nameOfArchive, Class<T> clazz)
    {
        String file = null;
        
        try {
            // Converts Json data into a string which is to be converted into a list of objects.
            file = new String(Files.readAllBytes(Paths.get(basePath + nameOfArchive)));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // converts string into an array of objects, then converting the array into an arraylist.
        ArrayList<T> list = new ArrayList<>();
        T[] array = gson.fromJson(file, clazz.isArray() ? clazz : Array.newInstance(clazz, 0).getClass());
        Collections.addAll(list, array);

        return list;
    }  

    /** Method intended to add an object to an archive, both passed as parameters.
     * Will ask for a list of objects as opposed to an object in order to prevent
     * quadratic problem. 
     * 
     * @param nameOfArchive
     * @param obj
     * @param clazz
     * @throws IOException
     */
    public <T> void serializeObject(String nameOfArchive, ArrayList<T> objList, Class<T> clazz)
    {
        try {
            // Arraylist that will be added to.
            ArrayList<T> jsonArr = createList(nameOfArchive, clazz);

            // If statement ensures that any given list will never get so big that the computer runs out of storage.
            if (jsonArr.size() <= 1000)
            {
                jsonArr.addAll(objList);

                String newList = gson.toJson(jsonArr);

                FileWriter fileWriter = new FileWriter(basePath + nameOfArchive);
                fileWriter.write(newList);
                fileWriter.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
