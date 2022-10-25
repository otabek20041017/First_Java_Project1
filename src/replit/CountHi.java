package replit;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            } else  {
                System.out.println(0);
            }
        }
        System.out.println(count);
    }
}