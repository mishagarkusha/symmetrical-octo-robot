package com.suitt.gk.assignment3.models;

public class Sportsman extends Person {
    protected String kindOfSport;
    protected String achievementInSport;

    public Sportsman(String name, int age, String career, String kindOfSport, String rankInSport) {
        super(name, age, career);
        this.kindOfSport = kindOfSport;
        this.achievementInSport = rankInSport;
    }

    public Sportsman() {
        this.kindOfSport = "Nothing";
        this.achievementInSport = "Nothing";
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public String getAchievementInSport() {
        return achievementInSport;
    }

    public void setAchievementInSport(String achievementInSport) {
        this.achievementInSport = achievementInSport;
    }

    @Override
    public String toString() {
        return setGreenColorText("Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", career='" + career + '\'' +
                ", kindOfSport='" + kindOfSport + '\'' +
                ", rankInSport='" + achievementInSport + '\'' +
                '}');
    }

    public void outputKindOfSport() {
        switch (kindOfSport) {
            case "Boxing" -> print(name +" is boxer!");
            case "Swimming" -> print(name +" is swimmer!");
            case "Racing" -> print(name +" is racer!");
            case "Dancing" -> print(name + " is dancer!");
            case "Chess" -> print(name + " is chess player!");
            default -> print(name +"'s kind of sport is " + kindOfSport);
        }
    }

}
