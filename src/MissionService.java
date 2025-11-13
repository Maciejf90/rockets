import exceptions.MissionNotFoundException;
import exceptions.RocketNotAvailable;
import exceptions.RocketNotFound;
import model.Mission;
import model.MissionStatus;
import model.Rocket;
import model.RocketState;

public class MissionService {

    public static void createNewMission(String name) {
        Database.missions.add(new Mission(name));
    }

    public static void assignRocketToMission(String missionName, String rocketName) {
        Rocket rocket = findRocketByName(rocketName);
        Mission mission = findMissionByName(missionName);
        if (rocketNotInOtherMission(rocket)) {
            mission.assignRocket(rocket);
        } else {
            throw new RocketNotAvailable();
        }
    }

    private static Mission findMissionByName(String missionName) {
        return Database.missions.stream()
                .filter(m -> missionName.equals(m.getName()))
                .findAny()
                .orElseThrow(() -> new MissionNotFoundException(missionName + " not found"));
    }

    private static Rocket findRocketByName(String rocketName) {
        return Database.rockets.stream()
                .filter(rocket -> rocket.getName().equals(rocketName))
                .findFirst()
                .orElseThrow(() -> new RocketNotFound(rocketName + " not found"));

    }

    private static boolean rocketNotInOtherMission(Rocket rocketName) {
        return Database.missions.stream()
                        .filter(l -> l.getRockets().contains(rocketName))
                        .findAny()
                        .isEmpty();
    }

    public static void deployRocket(String rocketName) {
        Rocket rocket = findRocketByName(rocketName);
            rocket.setRocketState(RocketState.IN_SPACE);
            Database.missions.stream()
                    .filter(l -> l.getRockets().contains(rocket))
                    .findAny()
                    .ifPresent(l -> l.changeMissionStatus(MissionStatus.IN_PROGRESS));
    }
}
