package RailiwatStation;
import java.time.LocalDateTime;
import  java.util.*;



public class Schedule {

    private station station;
    private Train train;
    private String arrivalTime;
    private String  departureTime;
    private platform platform;

    public Schedule(station station, Train train, String departureTime, String arrivalTime, platform platform) {
        this.station = station;
        this.train = train;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.platform = platform;
    }

    public RailiwatStation.station getStation() {
        return station;
    }

    public void setStation(RailiwatStation.station station) {
        this.station = station;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public RailiwatStation.platform getPlatform() {
        return platform;
    }

    public void setPlatform(RailiwatStation.platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "station=" + station +
                ", train=" + train +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", platform=" + platform +
                '}';
    }
}
