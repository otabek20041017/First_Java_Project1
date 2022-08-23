package replit;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(word.replace("X", ""));
        System.out.println(word.replace("x", ""));
    }
}
