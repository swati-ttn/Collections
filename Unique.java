package com.ttn.java.Collections;

import java.util.HashSet;
import java.util.Set;

public class Unique {

        int unique(String myString)
        {
            int no_UC;
            char[] stringAsArray = myString.toLowerCase().toCharArray();
            Set<Character> characterS = new HashSet<>();
            for (char s : stringAsArray) {
                characterS.add(s);
            }
            no_UC = characterS.size();
            return no_UC;
        }
    public static void main(String[] arg)
    {
        Unique UC = new Unique();
        String[] input ={"Saanvi"};
        for(String I :input)
        {
            System.out.println(" Unique Characters :" + I +":" + UC.unique(I));
        }
    }
}