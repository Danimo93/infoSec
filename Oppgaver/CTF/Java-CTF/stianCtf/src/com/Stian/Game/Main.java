package com.Stian.Game;

import com.Stian.Info.Write;

public class Main {
    public static void main(String[] args) {
        /*
                In this project, we will make objects with constructors.
                When they are created, we are going to print them into a txt file
                Then we are going to gather the information back into an object and use
                it and modify it.

                When this is done, we are going to try to encrypt the data, so the player
                cannot modify it.

                I have hidden a flag in the flag.txt file. But it must be decrypted with
                my custom made encryption.

                You can read the code and find out how to unlock the flag, or you can try
                to decrypt the flag itself. Either way, it will not be easy ;)

                Good luck and have fun <3
         */
        Write wR = new Write();
        wR.objectCreator();
    }
}
