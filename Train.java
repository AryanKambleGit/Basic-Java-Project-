package RailiwatStation;

class Train{

    private String trainId;
    private String trainName;

  //  private String type;

    public Train(String trainName,String trainId) {
        this.trainName = trainName;
        this.trainId = trainId;
      //  this.type =type;
    }
// default contructor
    public Train() {

    }
    public void settrain(String trainname){
        this.trainName = trainname;
    }
    public String gettrain(){
        return trainName;

    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainName='" + trainName + '\'' +
                ", type='" +// type + '\'' +
                '}';
    }
}


