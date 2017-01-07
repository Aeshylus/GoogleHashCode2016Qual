package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Олександр on 07.01.2017.
 */
public class DroneCommand {
    public enum Type{
        LOAD,
        DELIVER,
        UNLOAD,
        WAIT
    }

    public Integer droneId;
    public Type type;
    public Integer targetId;
    public Map<Integer, Integer> cargo;

    DroneCommand(int _droneId, Type _type, int _targetId){
        droneId = _droneId;
        type = _type;
        targetId = _targetId;
        cargo = new HashMap<Integer, Integer>();
    }

    String getDescription(){
        String descr = "";
        descr += droneId.toString();
        descr += " ";

        switch(type){
            case DELIVER:
                descr += "D ";
                break;
            case LOAD:
                descr += "L ";
                break;
            case UNLOAD:
                descr += "U ";
                break;
            case WAIT:
                descr += "W ";
                break;
        }

        descr += targetId.toString();
        for (Map.Entry<Integer, Integer> entry : cargo.entrySet())
            descr += " " + entry.getKey() + " " + entry.getValue();

        return descr;
    }


}
