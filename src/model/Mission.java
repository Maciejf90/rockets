package model;

import java.util.ArrayList;
import java.util.List;

public class Mission {

    private String name;

    private MissionStatus missionStatus;

    private List<Rocket> rockets = new ArrayList<>();



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

    public List<Rocket> getRockets() {
        return rockets;
    }

    public void setRockets(List<Rocket> rockets) {
        this.rockets = rockets;
    }
}
