import model.Rocket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        initRockets();

        MissionService.createNewMission("Mars");
        MissionService.createNewMission("Luna1");

        MissionService.assignRocketToMission("Luna1", "Dragon 1");
        MissionService.assignRocketToMission("Luna1", "Dragon 2");

        MissionService.deployRocket("Dragon 1");
        MissionService.rapairRocket("Dragon 2");

        System.out.println(Database.rockets);
        System.out.println(Database.missions);

        ReportingService.makeReport();
    }

    private static void initRockets() {
        Database.rockets.add(new Rocket("Dragon 1"));
        Database.rockets.add(new Rocket("Dragon 2"));
        Database.rockets.add(new Rocket("Red Dragon"));
        Database.rockets.add(new Rocket("Dragon XL"));
        Database.rockets.add(new Rocket("Falcon Heavy"));
    }
}