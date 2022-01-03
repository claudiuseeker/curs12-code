package ro.fasttrackit.curs12;

public enum PuncteCardinale {
    NORD("N"),
    SUD("S"),
    EST("E"),
    VEST("V");

    private final String prescurtare;

    PuncteCardinale(String prescurtare){
        this.prescurtare = prescurtare;

    }

    public String toDirection(){
        return switch (this){
            case NORD -> "UP";
            case SUD -> "DOWN";
            case EST -> "RIGHT";
            case VEST -> "VEST";
        };
    }
}
