package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mission {

    public Mission(String name) {
        this.name = name;
        this.missionStatus = MissionStatus.SCHEDULED;
    }

    private String name;

    private MissionStatus missionStatus;

    private Set<Rocket> rockets = new HashSet<>();

    public void changeMissionStatus(MissionStatus status) {
        this.missionStatus = status;
    }

    public void assignRocket(Rocket rocket) {
        this.rockets.add(rocket);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionStatus getMissionStatus() {
        return missionStatus;
    }

    public void setMissionStatus(MissionStatus missionStatus) {
        this.missionStatus = missionStatus;
    }

    public Set<Rocket> getRockets() {
        return rockets;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "name='" + name + '\'' +
                ", missionStatus=" + missionStatus +
                ", rockets=" + rockets +
                '}';
    }
}
