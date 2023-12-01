package cars2;

import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.InstanceCreator;

public class FaultInstanceCreator implements InstanceCreator<Fault>{
    private String faultType;
    private String faultID;
    private String subSystemName;
    private TimeWindow timeWindow;
    private ArrayList<String> vehicles;
    private boolean active;

    public void attributeInstantiator(String ft, String fid, String s, String ts, String tc, ArrayList<String> v, boolean a)
    {
        faultType = ft;
        faultID = fid;
        subSystemName = s;
        timeWindow = new TimeWindow(ts, tc);
        vehicles = v;
        active = a;
    }

    @Override
    public Fault createInstance(Type type) {
        return new Fault(faultType, faultID, subSystemName, timeWindow.getTimeStarted(), timeWindow.getTimeCleared(), vehicles, active);
    }
    
}
