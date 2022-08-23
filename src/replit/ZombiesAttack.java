package replit;
import java.util.Scanner;
public class ZombiesAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int inhabitants = input.nextInt();

        for (int i = 0; i < days; i++) {
            System.out.println(days-1);
        }
        for (int j = 0; j < inhabitants; j++) {
            System.out.println("Day" + days + "[" + inhabitants / 2 + "]");
        }
        System.out.println("---- EXTINCT ----");
    }
}

