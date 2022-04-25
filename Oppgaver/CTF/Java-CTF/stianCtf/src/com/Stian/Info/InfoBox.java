package com.Stian.Info;

import com.Stian.Constructors.Character;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InfoBox {
    public ArrayList<Character> readFile(){
        ArrayList<Character> cH = new ArrayList<>();
        try {
            File myObj = new File("Cache/Cache.txt");

            Scanner myReader = new Scanner(myObj);

            String encodedString = myReader.nextLine();
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            String data = new String(decodedBytes);

            String str[] = data.split("\n");
            List<String> al = new ArrayList<String>();
            al = Arrays.asList(str);

            Character stian = new Character(Integer.parseInt(al.get(0)), al.get(1), Integer.parseInt(al.get(2)), Integer.parseInt(al.get(3)));
            cH.add(stian);

            Character petter = new Character(Integer.parseInt(al.get(4)), al.get(5), Integer.parseInt(al.get(6)), Integer.parseInt(al.get(7)));
            cH.add(petter);

            Character preben = new Character(Integer.parseInt(al.get(8)), al.get(9), Integer.parseInt(al.get(10)), Integer.parseInt(al.get(11)));
            cH.add(preben);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cH;
    }
}
