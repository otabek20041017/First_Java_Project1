package day20_loops;

import java.util.Scanner;

public class CamelCase {
    /*
    Camel Case

Given a String with multiple words separated by spaces, create a camel case version of the


     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple words: ");
        String str = input.nextLine();
        String camelCase = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {

                camelCase += str.substring(i+1, i+2).toUpperCase();   // gives the one character after the space
                //("" + str.charAt(i + 1 )).toUppercase)
                i++;
            } else {
                camelCase += str.charAt(i);
            }
        }

        System.out.println(camelCase);

    }
}













