package com.CS591;

public class Adventures {

    Monsters monsters = new Monsters();
    Actions actions = new Actions();

    private String enter;
    private String goDeeper;
    private String reachTheEnd;

    public Adventures() {
        this.enter = "entering the mouth of the cave";
        this.goDeeper = "ventured deeper into the cave";
        this.reachTheEnd = "reached the depths of the cave";
    }

    public String getEnter() {
        return enter;
    }

    public String getGoDeeper() {
        return goDeeper;
    }

    public String getReachTheEnd() {
        return reachTheEnd;
    }

    public String moveToNext() {
        return "Move on to the next adventure";
    }

    public String moveToFinal() {
        return "Move on to the final mission";
    }

    public String attackGoblin() {
        return "Attack the evil" + " " + monsters.getGoblin() + " and" + actions.getCleanCobWebs();
    }

    public String attackWombat() {
        return "Attack the evil" + " " + monsters.getWombat() + " " + actions.getTurnOffWaterSupply();
    }

    public String attackHobgoblinLord() {
        return "Attack the evil" + " " + monsters.getHobgoblinLord();
    }

}
