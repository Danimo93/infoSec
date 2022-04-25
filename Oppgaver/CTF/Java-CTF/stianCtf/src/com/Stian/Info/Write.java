package com.Stian.Info;

import com.Stian.Constructors.Character;
import com.Stian.Game.Move;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class Write {

    Move mV = new Move();

    public void objectCreator(){
        Character stian = new Character(1,"Stian",50,50);
        Character petter = new Character(2,"Petter",40,40);
        Character preben = new Character(3,"Preben",60,60);
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
            mV.getInfo();
    }
}
