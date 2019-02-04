package com.CS591;

public class Treasures {
    private String sword;
    private String shield;
    private String helmet;
    private String secondTreasure;

    public Treasures() {
        this.sword = "sword";
        this.helmet = "helmet";
        this.shield = "shield";
        this.secondTreasure = "silver tray of life";
    }

    public String getSword() {
        return sword;
    }

    public String getShield() {
        return shield;
    }

    public String getHelmet() {
        return helmet;
    }

    public String getSecondTreasure() {
        return secondTreasure;
    }

    public String pickUpSword() {
        return "Pick up the golden" + " " + this.getSword();
    }

    public String pickUpShield() {
        return "Pick up the golden" + " " + this.getShield();
    }

    public String pickUpHelmet() {
        return "Pick up the golden" + " " + this.getHelmet();
    }

    public String pickUpSecondTreasure() {
        return "Pick up the" + " " + this.getSecondTreasure();
    }
}
