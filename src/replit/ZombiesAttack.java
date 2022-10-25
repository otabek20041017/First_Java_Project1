package replit;

import java.util.Scanner;

public class ZombiesAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int inhabitants = input.nextInt();

        for (int i = 0; i <= days; i++) {
            System.out.println(i);
        }
        for (int j = 0; j < inhabitants; j++) {
            System.out.println(j/2);
        }
        System.out.println("Day" + days + "["+inhabitants+"]");
        System.out.println("---- EXTINCT ----");
    }
}


