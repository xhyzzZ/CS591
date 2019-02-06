package com.CS591;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        HelperFunctions helperFunctions = new HelperFunctions();
        Scanner line = new Scanner(System.in);
        String decision;

        //welcome
        helperFunctions.welcome();
        decision = line.nextLine();

        //acceptChallenge
        helperFunctions.acceptChallenge(decision);
        decision = line.nextLine();

        //readyToEnter
        helperFunctions.readyToEnter(decision);
        decision = line.nextLine();

        helperFunctions.includeAllThreeParts(decision);


    }

}
