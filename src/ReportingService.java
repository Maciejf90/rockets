import model.Mission;
import model.Rocket;

public class ReportingService {
    public static void makeReport() {
        for (Mission mission : Database.missions) {
            System.out.println(mission.getName() + " - " + mission.getMissionStatus() + " - " + mission.getRockets().size());
            for (Rocket rocket : mission.getRockets()) {
                System.out.println("--- " + rocket.getName() + " - " + rocket.getRocketState());
            }
        }
    }
}
