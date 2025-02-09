package RailiwatStation;

public class platform {
    private String platformNum ;
    private Train train ;

    public platform(String platformNum) {
        this.platformNum = platformNum;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Train getTrain ( )
    {
     return train;
    }
    //    public void setTrain(String platformNum){
//        this.platformNum =  platformNum;
//    }
//
//    public String getTrain(){
//        return platformNum;
//    }
//

    public String getPlatformNum(){
        return platformNum;
    }
    public void setPlatformNum (String platformNum){
        this.platformNum = platformNum;
    }

    @Override
    public String toString() {
        return "platform{" +
                "platformNum='" + platformNum + '\'' +
                ", train=" + train +
                '}';
    }
}
