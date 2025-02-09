package RailiwatStation;

import java.util.ArrayList;
import java.util.List;

public class station {

    private String stationID;
    private String staionName;

    private List<platform> platformlist;

    public station(String stationID, String staionName) {
        this.stationID = stationID;
        this.staionName = staionName;
        this.platformlist = new ArrayList<>();
    }

    public String getStationID() {
        return stationID;
    }

    public void setStationID(String stationID) {
        this.stationID = stationID;
    }

    public String getStaionName() {
        return staionName;
    }

    public void setStaionName(String staionName) {
        this.staionName = staionName;
    }

    public List<platform> getPlatformlist() {
        return platformlist;
    }

    public void setPlatformlist(List<platform> platformlist) {
        this.platformlist = platformlist;
    }

    @Override
    public String toString() {
        return "station{" +
                "stationID='" + stationID + '\'' +
                ", staionName='" + staionName + '\'' +
                ", platformlist=" + platformlist +
                '}';
    }
}
