package com.CS591;

public class Actions {

    private String cleanCobWebs;
    private String turnOffWaterSupply;
    private String performPoetry;

    public Actions() {
        this.cleanCobWebs = " clean up all the cob webs";
        this.turnOffWaterSupply = "turn off the water supply";
        this.performPoetry = "perform the poetry of life";
    }

    public String getCleanCobWebs() {
        return cleanCobWebs;
    }

    public String getTurnOffWaterSupply() {
        return turnOffWaterSupply;
    }

    public String getPerformPoetry() {
        return performPoetry;
    }
}
