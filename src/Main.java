import model.Rocket;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        initRockets();
        initMissions();

        MissionService.assignRocketToMission("Luna1", "Dragon 1");
        MissionService.assignRocketToMission("Luna1", "Dragon 2");
        MissionService.assignRocketToMission("Luna2", "Polonez");
        MissionService.assignRocketToMission("Double Landing", "Dragon XL");
        MissionService.assignRocketToMission("Vertical Landing", "Red Dragon");
        MissionService.deployRocket("Dragon XL");
        MissionService.deployRocket("Red Dragon");
        MissionService.removeRocket("Red Dragon");
        MissionService.removeRocket("Dragon XL");

        MissionService.assignRocketToMission("Transit", "Dragon XL");
        MissionService.assignRocketToMission("Transit", "Falcon Heavy");
        MissionService.assignRocketToMission("Transit", "Red Dragon");
        MissionService.deployRocket("Dragon XL");
        MissionService.deployRocket("Falcon Heavy");

        MissionService.rapairRocket("Dragon 1");

        ReportingService.makeReport();
    }

    private static void initMissions() {
        MissionService.createNewMission("Mars");
        MissionService.createNewMission("Luna1");
        MissionService.createNewMission("Luna2");
        MissionService.createNewMission("Double Landing");
        MissionService.createNewMission("Transit");
        MissionService.createNewMission("Vertical Landing");
    }

    private static void initRockets() {
        Database.rockets.add(new Rocket("Dragon 1"));
        Database.rockets.add(new Rocket("Dragon 2"));
        Database.rockets.add(new Rocket("Red Dragon"));
        Database.rockets.add(new Rocket("Dragon XL"));
        Database.rockets.add(new Rocket("Falcon Heavy"));
        Database.rockets.add(new Rocket("Polonez"));
    }
}