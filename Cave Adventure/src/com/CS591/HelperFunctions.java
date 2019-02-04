package com.CS591;

import java.util.*;


public class HelperFunctions {


    Adventures adventures = new Adventures();
    Treasures treasures = new Treasures();
    Monsters monsters = new Monsters();
    Penances penances = new Penances();
    Random random = new Random();
    boolean[] arr= random.generateRandomArray();

    Scanner line = new Scanner(System.in);

    public void welcome() {
        String decision;
        System.out.println("Brave knight!!! What is your name?");
        decision = line.nextLine();
        System.out.println("We are in need of your help, " + decision);
        System.out.println("Our village is being overrun by the goblins of the NorthernCaves.");
        System.out.println("We need you to defeat them!");
        System.out.println("Will you accept the challenge (Y/N)?");
    }


    public void acceptChallenge(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("Y") || decision.equals("y")) {
                System.out.println("Thank You Thank You Oh brave knight, are you ready to enter the mouth of the caves (Y/N)?");
                isContinuing = false;
            } else if(decision.equals("N") || decision.equals("n")) {
                System.out.println("…. Please, please help up brave knight, are you ready to enter the mouth of the caves (Y/N)?");
                decision = line.nextLine();
            } else {
                System.out.println("Please enter valid input!");
                decision = line.nextLine();
            }
        }
    }
    /**
     * Thank You Thank You Oh brave knight, are you ready to enter the mouth of the caves (Y/N)?
     * @param decision
     */
    public void readyToEnter(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if (decision.equals("Y") || decision.equals("y")) {
                System.out.println("You are now" + " " + adventures.getEnter() + ", " + "what would you like to do?\n\n"
                        + "1)" + "  " + adventures.attackGoblin() + "\n" + "2)" + "  " + treasures.pickUpSword() + "\n\n"
                        + ">>");
                isContinuing = false;
            } else if (decision.equals("N") || decision.equals("n")) {
                System.out.println("Please prepare carefully, we will wait for you!");
                decision = line.nextLine();
            } else {
                validIuput();
            }
        }
    }

    /**
     * You are now entering the mouth of the cave, what would you like to do?
     *
     * 1)  Attack the evil goblin and clean up all the cob webs
     * 2)  Pick up the golden sword
     *
     * @param decision
     */
    public void enterTheMouthOfCave(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                System.out.println("You slayed the " + monsters.getGoblin() + " " + "and are still alive, what would you like to do?\n\n"
                        + "1)" + "  " + adventures.moveToNext() + "\n" + "2)" + "  " + treasures.pickUpSword() + "\n\n"
                        + ">>");
                isContinuing = false;
            } else if(decision.equals("2")) {
                System.out.println(penances.goblinPenance());
                isContinuing = false;
                decision = line.nextLine();
                // question
                firstInToPenance(decision);
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    /**
     * You slayed the goblin and are still alive, what would you like to do?
     *
     * 1)  Move on to the next adventure
     * 2)  Pick up the golden sword
     *
     * @param decision
     */
    public void moveOnToDeeper(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                //end all over and start again
                System.out.println("Emmm, you slayed the monster without picking up treasures, so you should end the game and start again...");
                includeWholeParts(decision);
                isContinuing = false;
            } else if(decision.equals("2")){
                System.out.println("You have " + adventures.getGoDeeper() + ", " + "what would you like to do?\n\n"
                        + "1)" + "  " + adventures.attackWombat() + "\n" + "2)" + "  " + treasures.pickUpShield() + "\n\n"
                        + ">>");
                isContinuing = false;
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    /**
     * You have ventured deeper into the cave, what would you like to do?
     *
     * 1)  Attack the evil wombat turn off the water supply
     * 2)  Pick up the golden shield
     *
     * @param decision
     */
    public void enterDeeper(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                System.out.println("You slayed the " + monsters.getWombat() + " " + "and are still alive, what would you like to do?\n\n"
                        + "1)" + "  " + adventures.moveToNext() + "\n" + "2)" + "  " + treasures.pickUpShield() + "\n\n"
                        + ">>");
                isContinuing = false;
            } else if(decision.equals("2")) {
                System.out.println(penances.wombatPenance());
                isContinuing = false;
                decision = line.nextLine();
                // question
                secondInToPenance(decision);
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    /**
     * You slayed the wombat and are still alive, what would you like to do?
     *
     * 1)  Move on to the next adventure
     * 2)  Pick up the golden shield
     *
     * @param decision
     */
    public void moveToTheEnd(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                //end all over and start again
                System.out.println("Emmm, you slayed the monster without picking up treasures, so you should end the game and start again...");
                includeWholeParts(decision);
                isContinuing = false;
            } else if(decision.equals("2")) {
                System.out.println("You have " + adventures.getReachTheEnd() + ", " + "what would you like to do?\n\n"
                        + "1)" + "  " + adventures.attackHobgoblinLord() + "\n" + "2)" + "  " + treasures.pickUpHelmet() + "\n\n"
                        + ">>");
                isContinuing = false;
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    /**
     * You have reached the depths of the cave, what would you like to do?
     *
     * 1)  Attack the evil hobgoblinLord
     * 2)  Pick up the golden helmet
     *
     * @param decision
     */
    public void enterTheEnd(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                System.out.println("You slayed the " + monsters.getHobgoblinLord() + " " + "and are still alive, what would you like to do?\n\n"
                        + "1)" + "  " + adventures.moveToFinal() + "\n" + "2)" + "  " + treasures.pickUpHelmet() + "\n\n"
                        + ">>");
                isContinuing = false;
            } else if(decision.equals("2")) {
                System.out.println(penances.hobgoblinLordPenance());
                isContinuing = false;
                decision = line.nextLine();
                //question
                thirdInToPenance(decision);
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    /**
     * You slayed the hobgoblinLord and are still alive, what would you like to do?
     *
     * 1)  Move on to the final mission
     * 2)  Pick up the golden helmet
     *
     * @param decision
     */
    public void moveToTheFinalMission(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                //end all over and start again
                System.out.println("Emmm, you slayed the monster without picking up treasures, so you should end the game and start again...");
                includeWholeParts(decision);
                isContinuing = false;
            } else if(decision.equals("2")) {
                //get the end
                System.out.println("You have picked up the golden helmet and are ready to move on to your final mission.\n\n"
                        + "Are you ready for the final mission (Y/N)?");
                isContinuing = false;
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    public void enterFinalMission(String decision) {
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("Y") || decision.equals("y")) {
                //game
                random.generateWords();
                isContinuing = false;
            } else if(decision.equals("N") || decision.equals("n")) {
                System.out.println("Please prepare carefully, we will wait for you...");
                decision = line.nextLine();
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    /**
     * Great! You are awake and rested what would you like to do?
     *
     * 1)  Attack the evil goblin and clean up all the cob webs
     * 2)  Pick up the silver tray of life
     *
     * @param decision
     */
    public void firstInToPenance(String decision) {
        Scanner line = new Scanner(System.in);
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                includeAllThreeParts(decision);
                isContinuing = false;
            } else if(decision.equals("2")){
                if(arr[0]) {
                    System.out.println(penances.songChristmas() + penances.afterSecondGoblinPenance());
                    decision = line.nextLine();
                    isContinuing = false;
                } else {
                    System.out.println("Emmm, unfortunately, you have no chance to take a second treasure，so you should start again");
                    includeWholeParts(decision);
                }
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
        enterSecondTreasureInFirstAdventure(decision);
    }

    public void secondInToPenance(String decision) {
        Scanner line = new Scanner(System.in);
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                includeSecondAndThirdParts(decision);
                isContinuing = false;
            } else if(decision.equals("2")){
                if(arr[1]) {
                    System.out.println(penances.songChristmas() + penances.afterSecondWombatPenance());
                    decision = line.nextLine();
                    isContinuing = false;
                } else {
                    System.out.println("Emmm, unfortunately, you have no chance to take a second treasure，so you should start again");
                    includeWholeParts(decision);
                }
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
        enterSecondTreasureInSecondAdventure(decision);
    }

    public void thirdInToPenance(String decision) {
        Scanner line = new Scanner(System.in);
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {
                includeThirdPart(decision);
                isContinuing = false;
            } else if(decision.equals("2")){
                if(arr[2]) {
                    System.out.println(penances.songChristmas() + penances.afterSecondHobgoblinLordPenance());
                    decision = line.nextLine();
                    isContinuing = false;
                } else {
                    System.out.println("Emmm, unfortunately, you have no chance to take a second treasure，so you should start again");
                    includeWholeParts(decision);
                }
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
        enterSecondTreasureInThirdAdventure(decision);
    }

    /**
     * On the third day of Christmas my true love gave to me, three French hens, two turtle doves and apartridge in a pear tree. Great! You have done your penance, what would you like to do?
     *
     * 1)  Attack the evil goblin and clean up all the cob webs
     * 2)  Pick up the silver tray of life
     *
     * @param decision
     */
    public void enterSecondTreasureInFirstAdventure(String decision) {
        Scanner line = new Scanner(System.in);
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {

                includeAllThreeParts(decision);

                isContinuing = false;
            } else if(decision.equals("2")) {
                System.out.println("You can not pick up silver tray of life again, game ends...");
                System.exit(0);
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    public void enterSecondTreasureInSecondAdventure(String decision) {
        Scanner line = new Scanner(System.in);
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {

                includeSecondAndThirdParts(decision);

                isContinuing = false;
            } else if(decision.equals("2")) {
                System.out.println("You can not pick up silver tray of life again, game ends...");
                System.exit(0);
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    public void enterSecondTreasureInThirdAdventure(String decision) {
        Scanner line = new Scanner(System.in);
        boolean isContinuing = true;
        while(isContinuing) {
            if(decision.equals("1")) {

                includeThirdPart(decision);

                isContinuing = false;
            } else if(decision.equals("2")) {
                System.out.println("You can not pick up silver tray of life again, game ends...");
                System.exit(0);
            } else {
                validIuput();
                decision = line.nextLine();
            }
        }
    }

    public void includeWholeParts(String decision) {
        //welcome
        welcome();
        decision = line.nextLine();

        //acceptChallenge
        acceptChallenge(decision);
        decision = line.nextLine();

        //readyToEnter
        readyToEnter(decision);
        decision = line.nextLine();

        //enterTheMouthOfCave
        enterTheMouthOfCave(decision);
        decision = line.nextLine();

        //moveOnToDeeper
        moveOnToDeeper(decision);
        decision = line.nextLine();

        //enterDeeper
        enterDeeper(decision);
        decision = line.nextLine();

        //moveToTheEnd
        moveToTheEnd(decision);
        decision = line.nextLine();

        //enterTheEnd
        enterTheEnd(decision);
        decision = line.nextLine();

        //moveToTheFinalMission
        moveToTheFinalMission(decision);
        decision = line.nextLine();

        //enterFinalMission
        enterFinalMission(decision);
        System.exit(0);
    }

    public void includeAllThreeParts(String decision) {
        //enterTheMouthOfCave
        enterTheMouthOfCave(decision);
        decision = line.nextLine();

        //moveOnToDeeper
        moveOnToDeeper(decision);
        decision = line.nextLine();

        //enterDeeper
        enterDeeper(decision);
        decision = line.nextLine();

        //moveToTheEnd
        moveToTheEnd(decision);
        decision = line.nextLine();

        //enterTheEnd
        enterTheEnd(decision);
        decision = line.nextLine();

        //moveToTheFinalMission
        moveToTheFinalMission(decision);
        decision = line.nextLine();

        //enterFinalMission
        enterFinalMission(decision);
        System.exit(0);
    }

    public void includeSecondAndThirdParts(String decision) {
        //enterDeeper
        enterDeeper(decision);
        decision = line.nextLine();

        //moveToTheEnd
        moveToTheEnd(decision);
        decision = line.nextLine();

        //enterTheEnd
        enterTheEnd(decision);
        decision = line.nextLine();

        //moveToTheFinalMission
        moveToTheFinalMission(decision);
        decision = line.nextLine();

        //enterFinalMission
        enterFinalMission(decision);
        System.exit(0);
    }

    public void includeThirdPart(String decision) {
        //enterTheEnd
        enterTheEnd(decision);
        decision = line.nextLine();

        //moveToTheFinalMission
        moveToTheFinalMission(decision);
        decision = line.nextLine();

        //enterFinalMission
        enterFinalMission(decision);
        System.exit(0);
    }

    public void validIuput() {
        System.out.println("Please enter valid input!");
    }
}
