package replit;

import java.util.*;

public class ReverseIt {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
        if (word.length() <= 5) {
            System.out.println("Too short!");
        } else if (word.length() >= 5) {
            System.out.println("Too long!");
        } else if (word.length() == 5) {
            System.out.println("reversed version");
        }
    }

}
