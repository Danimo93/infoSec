package com.Stian.Info;

import com.Stian.Constructors.Character;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Locale;
import java.util.Scanner;

public class UpdateMove {

    //Initiate objects
    Character stian = new Character(0,"",0,0);
    Character petter = new Character(0,"",0,0);
    Character preben = new Character(0,"",0,0);

    public void updatePlayerLocation(int playerID, ArrayList<Character> characters){

        Scanner uI = new Scanner(System.in);
        String input = uI.nextLine();

        boolean xCheck = false;
        boolean yCheck = false;
        int newCord = 0;
        if(input.toLowerCase(Locale.ROOT).equals("w")){
            newCord = characters.get(playerID).getY() + 1;
            yCheck = true;
        }
        if(input.toLowerCase(Locale.ROOT).equals("s")){
            newCord = characters.get(playerID).getY() - 1;
            yCheck = true;
        }
        if(input.toLowerCase(Locale.ROOT).equals("a")){
            newCord = characters.get(playerID).getX() - 1;
            xCheck = true;
        }
        if(input.toLowerCase(Locale.ROOT).equals("d")) {
            newCord = characters.get(playerID).getX() + 1;
            xCheck = true;
        }

        if(playerID == 0 && xCheck) {
             stian = new Character(1, "Stian", newCord, characters.get(0).getY());
             petter = new Character(2, "Petter", characters.get(1).getX(), characters.get(1).getY());
             preben = new Character(3, "Preben", characters.get(2).getX(), characters.get(2).getY());
        }
        if(playerID == 0 && yCheck) {
             stian = new Character(1, "Stian", characters.get(0).getX(), newCord);
             petter = new Character(2, "Petter", characters.get(1).getX(), characters.get(1).getY());
             preben = new Character(3, "Preben", characters.get(2).getX(), characters.get(2).getY());
        }
        if(playerID == 1 && xCheck) {
             stian = new Character(1, "Stian", characters.get(0).getX(), characters.get(0).getY());
             petter = new Character(2, "Petter", newCord, characters.get(1).getY());
             preben = new Character(3, "Preben", characters.get(2).getX(), characters.get(2).getY());
        }
        if(playerID == 1 && yCheck) {
             stian = new Character(1, "Stian", characters.get(0).getX(), characters.get(0).getY());
             petter = new Character(2, "Petter", characters.get(1).getX(), newCord);
             preben = new Character(3, "Preben", characters.get(2).getX(), characters.get(2).getY());
        }
        if(playerID == 2 && xCheck) {
             stian = new Character(1, "Stian", characters.get(0).getX(), characters.get(0).getY());
             petter = new Character(2, "Petter", characters.get(1).getX(), characters.get(1).getY());
             preben = new Character(3, "Preben", newCord, characters.get(2).getY());
        }
        if(playerID == 2 && yCheck) {
             stian = new Character(1, "Stian", characters.get(0).getX(), characters.get(0).getY());
             petter = new Character(2, "Petter", characters.get(1).getX(), characters.get(1).getY());
             preben = new Character(3, "Preben", characters.get(2).getX(), newCord);
        }
        try {
            FileWriter myWriter = new FileWriter("Cache/Cache.txt");
            //Plaintext data
            String plainText = stian.getID()+"\n"+
                    stian.getName()+"\n"+
                    stian.getX()+"\n"+
                    stian.getY()+"\n"+
                    petter.getID()+"\n"+
                    petter.getName()+"\n"+
                    petter.getX()+"\n"+
                    petter.getY()+"\n"+
                    preben.getID()+"\n"+
                    preben.getName()+"\n"+
                    preben.getX()+"\n"+
                    preben.getY();

            //Encoding.
            String encodedString = Base64.getEncoder().encodeToString(plainText.getBytes());

            //Write
            myWriter.write(encodedString);

            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
