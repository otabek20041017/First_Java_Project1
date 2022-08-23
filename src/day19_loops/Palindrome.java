package day19_loops;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Palindrome {

    /*

        given a String determine if it is palindrome
        means the String is read the same forwards and backwards

         ex:
            anna
            racecar
            maam
            abcba
     */
    public static void main(String[] args) {

        String s = "abcde";
        String reverse = "";
        // reverse my String, read it back from last index to first, backwards

        for (int i = s.length() -1; i >= 0; i--) { // i is just a number but using length -1 allow me to find last
            // index of the String, that means we can use that index to read characters
            reverse += s.charAt(i); // reverse = reverse + s.charAt(i)
            //System.out.println(s.charAt(i));
        }

        if (s.equals(reverse)) {

            System.out.println("Palindrome");
        }  else {
            System.out.println("Not Palindrome");
        }

        System.out.println(s.equals(reverse) ? "Plandrome" : "Not Palindrome");


    }
}