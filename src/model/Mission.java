package model;

import java.util.HashSet;
import java.util.Set;

public class Mission {

    public Mission(String name) {
        this.name = name;
        this.missionStatus = MissionStatus.SCHEDULED;
    }

    private final String name;

    private MissionStatus missionStatus;

    private final Set<Rocket> rockets = new HashSet<>();

    public void changeMissionStatus(MissionStatus status) {
        this.missionStatus = status;
    }

    public void assignRocket(Rocket rocket) {
        this.rockets.add(rocket);
    }

    public String getCombinedName() {
        return name + " - " + missionStatus.getValue();
    }

    public String getName() {
        return name;
    }

    public MissionStatus getMissionStatus() {
        return missionStatus;
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
