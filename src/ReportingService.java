import model.Mission;
import model.Rocket;

import java.util.Comparator;

public class ReportingService {

    public static final String INDENT_CHARS = "---";

    public static void makeReport() {

        // typically I would do it as a sql query. such calculations in java are not effective.
        // combining group_by and row_number() would be perfect.
        Database.missions.stream()
                        .sorted(
                                Comparator
                                        .comparingInt((Mission m) -> m.getRockets().size()).reversed()
                                        .thenComparing(Mission::getName, Comparator.reverseOrder())
                        ).forEach(
                                mission -> {
                                    System.out.println(mission.getCombinedName() + " - " + mission.getRockets().size());
                                    mission.getRockets().forEach(ReportingService::printRockets);
                                }
                );
    }

    private static void printRockets(Rocket rocket) {
        System.out.println(INDENT_CHARS + rocket);
    }
}
