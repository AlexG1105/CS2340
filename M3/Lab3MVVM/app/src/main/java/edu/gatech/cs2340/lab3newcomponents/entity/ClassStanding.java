package edu.gatech.cs2340.lab3newcomponents.entity;

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private String abbr;

    ClassStanding(String abbr) {
        this.abbr = abbr;
    }

    public String getStanding() {
        return abbr;
    }

    public void setStanding(String abbr) {
        this.abbr = abbr;
    }

    @Override
    public String toString() {
        return abbr;
    }

}
