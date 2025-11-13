import model.Mission;
import model.Rocket;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public interface Database {
    HashSet<Rocket> rockets = new HashSet<>();
    Set<Mission> missions = new TreeSet<>(Comparator.comparing(Mission::getName));

}
