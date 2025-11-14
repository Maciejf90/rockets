package model;

public enum RocketState {
    ON_GROUND("On ground"),
    IN_SPACE("In space"),
    IN_REPAIR("In repair");

    private final String value;

    RocketState(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
