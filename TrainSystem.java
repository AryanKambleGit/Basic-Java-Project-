package RailiwatStation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String ,station> stations = new HashMap<>();
    private Map<String , Train > trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();

    public void addStation(station station)
    {
        stations.put(station.getStationID(), station);
    }
    public void addTrain(Train train )
    {
        trains.put(train.getTrainId(),train);
    }
    public void addSchedule(Schedule schedule)
    {
        schedules.add(schedule);
    }

    public List< Schedule> findmytrain(String StartStationID , String EndStationId)
    {
        List<Schedule > res = new ArrayList<>();
        for (Schedule schedule : schedules ){
            if (schedule.getStation().getStationID().equals(StartStationID))
            {
                res.add(schedule);
            }
        }
            return res;
    }



}
