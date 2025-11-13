package model;

import java.util.Objects;

public class Rocket {

    public Rocket(String name) {
        this.name = name;
        this.rocketState = RocketState.ON_GROUND;
    }

    private String name;

    private RocketState rocketState;

    public String getName() {
        return name;
    }

    public RocketState getRocketState() {
        return rocketState;
    }

    public void setRocketState(RocketState rocketState) {
        this.rocketState = rocketState;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rocket)) return false;
        Rocket rocket = (Rocket) o;
        return Objects.equals(name, rocket.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", rocketState=" + rocketState +
                '}';
    }
}
