package replit;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:
        if (order.length() > 4) {
            System.out.println("Your total is $9.75");
        }

        if (order.length() < 4) {
            System.out.println("Your total is $12.50");
        }
    }
}
