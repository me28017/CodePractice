package com.blountmarquis.algorithms.recursion;

import java.util.ArrayList;

/**
 * Created by MLBlount on 2/21/2015.
 */
public class Permutation {

    public static void printPermutations(String str){
        StringBuffer sb = new StringBuffer();

        long startTime = System.currentTimeMillis();
        ArrayList<String> perms = getPermutations(str);
        long endTime = System.currentTimeMillis();
        System.out.println("----------");
        System.out.print("Permutations are: ");
        for(String s: perms){
            sb.append(s + " ");
        }
        System.out.println(sb.toString());
        System.out.println("----------");
        System.out.println("Total elapsed time " + (endTime - startTime) + " milliSeconds");
        System.out.println("Total number of permutation: " + perms.size());

    }


    private static ArrayList<String> getPermutations(String str){
        if(str == null) return null;

        ArrayList<String> permutations = new ArrayList<String>();
        if(str.length() == 0){
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);
       // System.out.print("Current moving letter is " + first + " and ");
        String remainingString = str.substring(1);
        //System.out.println("Current remaining string is " + remainingString);
        ArrayList<String> words = getPermutations(remainingString);
        //System.out.println();
        //System.out.print("words are ");
        //for(String word: words){
        //    System.out.print(word + " ");
        //}
        //System.out.println();
        for(String word: words){
            for(int i = 0; i <= word.length(); i++){
                //System.out.println("Current moving letter is " + first + " and Current word is: " + word);
                String s = insertCharAt(word, first, i);
                //System.out.println("Current combined String being added to perms list is " + s);
                permutations.add(s);
            }
        }
        return permutations;
    }

    private static String insertCharAt(String word, char c, int i) {
        String start = word.substring(0,i);
        String end = word.substring(i);
        return start + c + end;
    }

    public static void main(String[] args){
        printPermutations("0123");
    }
}
