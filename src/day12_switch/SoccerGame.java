package day12_switch;

import java.util.Scanner;

public class SoccerGame {
    /*
    declare and assign a minutes variable
use the minutes value to determine how much time is left in the soccer game

use these ranges to determine the outputs:

    - any number less than 0 and more than 90 are not valid.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();

        if(minutes > 0 && minutes <= 90) {
            // valid

            if(minutes >= 75) {
                System.out.println("just getting started");
            } else if (minutes >= 60){
                System.out.println("players are doing their best");
            } else if (minutes >= 30) {
                System.out.println("middle of the game is going great");
            } else {
                System.out.println("the end of the same is approaching");
            }

        }else {

            if(minutes < 0){
                System.out.println("minutes cannot be a negative number");
            } else {
                System.out.println("game cannot be longer than 90 minutes");
            }
            //System.out.println(minutes < 0 ? "minutes cannot be a negative number " : "game cannot be longer than 90 minutes");
        }

    }
}
