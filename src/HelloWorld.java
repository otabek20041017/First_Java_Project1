import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
/*
Use String methods to check if the given word contains the text java, but not anywhere in the String.
The java text must be in either position 0 or position 1 of the String.
If the text java appears in any other position it is not valid and is not considered to be found in the String.
Output a boolean value, true or false.
Note: You won't be able to just use contains method

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

 */

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (word.substring(0).equals("java")) {
            System.out.println(word);
        } else {
            System.out.println("not correct");
        }



    }
}
