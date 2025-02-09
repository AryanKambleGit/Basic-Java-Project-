 
package RailiwatStation;

import java.util.ArrayList;
import java.util.List;

public class findMyTrain {
    public static void main(String[] args) {
        // Initialize the train system
        TrainSystem system = new TrainSystem();

        // Create stations
        station station1 = new station("002", "Nagpur");
        station station2 = new station("003", "Pune");
        station station3 = new station("004", "Mumbai");
        station station4 = new station("005", "Delhi");

        // Create trains
        Train train1 = new Train("Duronto", "12321");
        Train train2 = new Train("Howrah Express", "32432");
        Train train3 = new Train("Shatabdi", "43543");
        Train train4 = new Train("Rajdhani", "54654");

        // Create platforms
        platform p1 = new platform("1");
        platform p2 = new platform("2");
        platform p3 = new platform("3");
        platform p4 = new platform("4");

        // Set trains to platforms
        p1.setTrain(train1);
        p2.setTrain(train2);
        p3.setTrain(train3);
        p4.setTrain(train4);

        // Create platform lists for stations
        List<platform> platformList1 = new ArrayList<>();
        platformList1.add(p1);
        platformList1.add(p2);

        List<platform> platformList2 = new ArrayList<>();
        platformList2.add(p3);
        platformList2.add(p4);

        List<platform> platformList3 = new ArrayList<>();
        platformList3.add(p1);
        platformList3.add(p4);

        List<platform> platformList4 = new ArrayList<>();
        platformList4.add(p2);
        platformList4.add(p3);

        // Assign platforms to stations
        station1.setPlatformlist(platformList1);
        station2.setPlatformlist(platformList2);
        station3.setPlatformlist(platformList3);
        station4.setPlatformlist(platformList4);

        // Create schedules
        Schedule s1 = new Schedule(station1, train1, "08:00", "08:30", p1);
        Schedule s2 = new Schedule(station1, train2, "09:00", "09:30", p2);
        Schedule s3 = new Schedule(station2, train3, "10:00", "10:30", p3);
        Schedule s4 = new Schedule(station2, train4, "11:00", "11:30", p4);
        Schedule s5 = new Schedule(station3, train1, "12:00", "12:30", p1);
        Schedule s6 = new Schedule(station3, train2, "13:00", "13:30", p2);
        Schedule s7 = new Schedule(station4, train3, "14:00", "14:30", p3);
        Schedule s8 = new Schedule(station4, train4, "15:00", "15:30", p4);

        // Add data to the system
        system.addTrain(train1);
        system.addTrain(train2);
        system.addTrain(train3);
        system.addTrain(train4);
        system.addStation(station1);
        system.addStation(station2);
        system.addStation(station3);
        system.addStation(station4);
        system.addSchedule(s1);
        system.addSchedule(s2);
        system.addSchedule(s3);
        system.addSchedule(s4);
        system.addSchedule(s5);
        system.addSchedule(s6);
        system.addSchedule(s7);
        system.addSchedule(s8);

        // Example of finding trains from a specific start station
        List<Schedule> myTrains = system.findmytrain("002", "003");
        System.out.println("Trains from Nagpur to Pune:");
        for (Schedule schedule : myTrains) {
            System.out.println(schedule);
            System.out.println();
        }
    }
}