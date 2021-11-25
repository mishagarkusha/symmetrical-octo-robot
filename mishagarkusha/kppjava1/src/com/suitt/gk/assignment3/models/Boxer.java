package com.suitt.gk.assignment3.models;

public class Boxer extends Sportsman {
    private WeightDivisions weightDivisions;

    public Boxer(String name, int age, String career, String kindOfSport, String rankInSport, WeightDivisions weightDivisions) {
        super(name, age, career, kindOfSport, rankInSport);
        this.weightDivisions = weightDivisions;
    }

    public Boxer() {
        super();
        this.weightDivisions = WeightDivisions.HEAVYWEIGHT;
    }

    public WeightDivisions getWeightDivisions() {
        return weightDivisions;
    }

    public void setWeightDivisions(WeightDivisions weightDivisions) {
        this.weightDivisions = weightDivisions;
    }

    @Override
    public String toString() {
        return setGreenColorText("Boxer{" +
                "weightDivisions=" + weightDivisions +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                ", kindOfSport='" + kindOfSport + '\'' +
                ", achievementInSport='" + achievementInSport + '\'' +
                '}');
    }

    public String getLimitsOfWeightDivision() {
        return switch (weightDivisions) {
            case MINIMUM_WEIGHT -> "48 kg";
            case LIGHT_FLYWEIGHT -> "49 kg";
            case FLYWEIGHT -> "51 kg";
            case SUPER_FLYWEIGHT -> "52 kg";
            case BANTAMWEIGHT -> "53.5 kg";
            case SUPER_BANTAMWEIGHT -> "55 kg";
            case FEATHERWEIGHT -> "57 kg";
            case SUPER_FEATHERWEIGHT -> "59 kg";
            case LIGHTWEIGHT -> "61 kg";
            case SUPER_LIGHTWEIGHT -> "63.5 kg";
            case WELTERWEIGHT -> "67 kg";
            case SUPER_WELTERWEIGHT -> "70 kg";
            case MIDDLEWEIGHT -> "72.5 kg";
            case SUPER_MIDDLEWEIGHT -> "76 kg";
            case LIGHT_HEAVYWEIGHT -> "79 kg";
            case CRUISER_WEIGHT -> "91 kg";
            case HEAVYWEIGHT -> "unlimited";
        };
    }
}


