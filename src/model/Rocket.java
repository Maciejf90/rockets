package model;

public class Rocket {

    private String name;

    private RocketState rocketState;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RocketState getRocketState() {
        return rocketState;
    }

    public void setRocketState(RocketState rocketState) {
        this.rocketState = rocketState;
    }
}
