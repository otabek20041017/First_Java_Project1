package homeworks;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {


        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //WRITE YOUR CODE BELOW
        if (player > 21){
            System.out.println("player bust");
        } else if (player == house) {
            System.out.println("it a tie");
        } else if (player == 21){
            System.out.println("player win");
        } else if (house > player) {
            System.out.println("player lose");
        } else if (player > house) {
            System.out.println("player win");
        }

    }
}