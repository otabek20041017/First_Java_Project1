package replit;

import java.util.Scanner;
public class VerifyContains {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW
        System.out.println("without first letter: " + word.substring(1) +  "\nwithout last letter: " + word.substring(0,
                word.length() - 1));



    }
}
