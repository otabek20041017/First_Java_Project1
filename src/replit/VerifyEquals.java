package replit;

import java.util.*;

public class VerifyEquals {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE BELOW:

        if (word2.length() >= word1.length() && word2.length() <= word1.length()){
            System.out.println(word1);
            System.out.println(word2);
        } else {
            System.out.println();
        }

    }
}