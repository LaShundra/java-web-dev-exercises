package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        String countingCharacters = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//        char[] charactersInString = countingCharacters.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char i : countingCharacters.toCharArray()) {
            if (Character.isAlphabetic(i)) {
                i = Character.toLowerCase(i);
                if (charCount.containsKey(i)) {
                    charCount.put(i, charCount.get(i) + 1);
                } else {
                    charCount.put(i, 1);
                }

            } else {
                if (charCount.containsKey(i)) {
                    charCount.put(i, charCount.get(i) + 1);
                } else {
                    charCount.put(i, 1);
                }
            }
        }
            for (Map.Entry<Character, Integer> result : charCount.entrySet()){
                System.out.println((result.getKey()) +" :" + result.getValue());
            }
        }
    }

