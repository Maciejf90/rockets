import model.Mission;
import model.Rocket;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public interface Database {
    HashSet<Rocket> rockets = new HashSet<>();

    // I wanted the missions to be ordered by default on insert,
    // but since we do ordering in the report, we could possibly make it a hashset.
    // Also, hashset has better read performance, so in this case (reports) it would be better.
    Set<Mission> missions = new TreeSet<>(Comparator.comparing(Mission::getName));
}
