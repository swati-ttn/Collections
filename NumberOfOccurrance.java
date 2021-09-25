package com.ttn.java.Collections;

import java.util.*;
import java.util.List;

public class NumberOfOccurrance
{
    public static void main(String[] args)
    {
        NumberOfOccurrance count = new NumberOfOccurrance();
        String myString = "SwatiPanwar";
        count.CharacterOccurrance(myString);
    }

    void CharacterOccurrance(String myString)
    {
        System.out.println("Test Number of Occurrance: " + myString);

         char[] stringAsArray = myString.toLowerCase().toCharArray();
         List<Character> charList = new ArrayList<>();

         for (char C : stringAsArray)
             charList.add(C);

         Map<Character, Integer> charFreqMap = new LinkedHashMap<>();

        for (Character C : charList)
        {
            charFreqMap.put(C, Collections.frequency(charList, C));
        }
         for (Map.Entry m : charFreqMap.entrySet())
         {
            System.out.println(m.getKey() + ":" + m.getValue() + " times");
         }
    }
}