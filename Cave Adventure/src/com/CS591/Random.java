package com.CS591;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Random {

    Scanner line = new Scanner(System.in);
    List<String> words = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    private boolean firstIfHaveSecondTreasure;
    private boolean secondIfHaveSecondTreasure;
    private boolean thirdIfHaveSecondTreasure;
    private boolean[] arr;

    public Random() {
        this.firstIfHaveSecondTreasure = false;
        this.secondIfHaveSecondTreasure = false;
        this.thirdIfHaveSecondTreasure = false;
        arr = new boolean[] {firstIfHaveSecondTreasure, secondIfHaveSecondTreasure, thirdIfHaveSecondTreasure};
    }

    public String generateWords() {
        int number = 1;
        String decision = "";
        while(!decision.equals("end")) {
            System.out.println("Village Idiot #" + number + ", what is your special word?");
            decision = line.nextLine();
            words.add(decision);
            number++;
        }
        //random sort
        Collections.shuffle(words);
        for(int i = 0; i < words.size(); i++) {
            sb.append(words.get(i) + " ");
        }
        System.out.println(sb.toString());
        return decision;
    }

    public String generateSongs() {
        List<String> words = new ArrayList<>();
        File animal = new File("/Users/kobale/IdeaProjects/Cave Adventure/src/Old macdonald had a farm");
        Scanner scan = null;
        try {
            scan = new Scanner(animal);
        } catch (Exception e) {
        }
        while (scan.hasNext()) {
            words.add(scan.next());
        }
        String word = words.get((int) (Math.random() * words.size()));
        return word;
    }

    public boolean[] generateRandomArray() {
        int randomIndex = (int)(Math.random() * arr.length);
        arr[randomIndex] = true;
        return arr;
    }

}
