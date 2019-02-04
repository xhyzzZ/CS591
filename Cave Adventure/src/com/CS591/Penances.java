package com.CS591;

public class Penances {

    Adventures adventures = new Adventures();
    Treasures treasures = new Treasures();
    Random random = new Random();

    public String goRest() {
        return "You have picked up the treasure, now go rest before continuing the mission.";
    }

    public String songOldMacDonald() {
        String word = random.generateSongs();
        String word2 = random.generateSongs();
        String word3 = random.generateSongs();
        String word4 = random.generateSongs();
        return "Old McDonald had a farm\n" +
                "E-I-E-I-O\n" +
                "And on his farm he had a " + word + "\n" +
                "E-I-E-I-O\n" +
                "With a " + word2 + " " + word2 + "\n" +
                "Und 'nem wau wau da\n" +
                "Here a " + word3 + ", da 'n wau\n" +
                "Everywhere a"+ " " + word4 + " " + word4 + "\n" +
                "Old MacDonald had a farm\n" +
                "E-I-E-I-O";
    }

    public String songChristmas() {
        return "They tricked you into picking up a second treasure, your penance is to sing the Twelve Days of" +
                "Christmas.\n\n" + "On the first day of Christmas my true love gave to me, a partridge in a pear tree\n\n" +
                "On the second day of Christmas my true love gave to me, two turtle doves and a partridge in a pear tree.\n\n" +
                "On the third day of Christmas my true love gave to me, three French hens, two turtle doves and a" +
                "partridge in a pear tree. ";
    }

    public String goblinPenance() {
        return this.goRest() + "\n\n" + this.songOldMacDonald() + "\n\n" + "Great! You are awake and rested what would you like to do?\n\n"
                + "1)" + "  " + adventures.attackGoblin() + "\n" + "2)" + "  " + treasures.pickUpSecondTreasure() + "\n\n" + ">>";
    }

    public String wombatPenance() {
        return this.goRest() + "\n\n" + this.songOldMacDonald() + "\n\n" + "Great! You are awake and rested what would you like to do?\n\n"
                + "1)" + "  " + adventures.attackWombat() + "\n" + "2)" + "  " + treasures.pickUpSecondTreasure() + "\n\n" + ">>";
    }

    public String hobgoblinLordPenance() {
        return this.goRest() + "\n\n" + this.songOldMacDonald() + "\n\n" + "Great! You are awake and rested what would you like to do?\n\n"
                + "1)" + "  " + adventures.attackHobgoblinLord() + "\n" + "2)" + "  " + treasures.pickUpSecondTreasure() + "\n\n" + ">>";
    }

    public String afterSecondGoblinPenance() {
        return "Great! You have done your penance, what would you like to do?\n\n"
                + "1)" + "  " + adventures.attackGoblin() + "\n" + "2)" + "  " + treasures.pickUpSecondTreasure() + "\n\n" + ">>";
    }

    public String afterSecondWombatPenance() {
        return "Great! You have done your penance, what would you like to do?\n\n"
                + "1)" + "  " + adventures.attackWombat() + "\n" + "2)" + "  " + treasures.pickUpSecondTreasure() + "\n\n" + ">>";
    }

    public String afterSecondHobgoblinLordPenance() {
        return "Great! You have done your penance, what would you like to do?\n\n"
                + "1)" + "  " + adventures.attackHobgoblinLord() + "\n" + "2)" + "  " + treasures.pickUpSecondTreasure() + "\n\n" + ">>";
    }

}
