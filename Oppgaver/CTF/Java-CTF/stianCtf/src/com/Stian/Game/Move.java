package com.Stian.Game;

import com.Stian.Constructors.Character;
import com.Stian.Info.Flag;
import com.Stian.Info.InfoBox;
import com.Stian.Info.UpdateMove;

import java.util.ArrayList;

public class Move {
    InfoBox iB = new InfoBox();
    UpdateMove uM = new UpdateMove();
    public void getInfo(){
        //Get character info from file.
        ArrayList<Character> characters = iB.readFile();
        //Generate random player.
        int randomID = (int) (Math.random()*3);

        //Text
        System.out.println("Welcome "+characters.get(randomID).getName()+"!");
        System.out.println("Use wasd to move.\n");

        move(randomID);
    }
    public void move(int playerID){
        //Get character info from file.
        ArrayList<Character> characters = iB.readFile();
        if(characters.get(2).getX() == 25 && characters.get(2).getY() == 75){
            Flag fL = new Flag();
           int x = 78 * 245 - 55 / 2 + 34895 / 1000;
            fL.decode(x);
        }

        System.out.println("You are currently..\n" +
                "X: "+characters.get(playerID).getX()+"\n" +
                "Y: "+characters.get(playerID).getY()+"");
        System.out.println("Where do you want to go?");

        uM.updatePlayerLocation(playerID,characters);
        move(playerID);
    }
}
