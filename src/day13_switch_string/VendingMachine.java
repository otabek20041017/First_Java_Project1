package day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        /*
        vending machine
            snacks
                1
                2
                3
            drinks
                4
                5
                6


         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Vending Machine. Select the menu you want to see:\n\tSnacks\n\tDrinks");
        System.out.print("Choose Product: ");
        String menu = scanner.next();

        switch (menu){

            case "Snacks":
                System.out.println("Pick the snack:\n1)Chips 2)Cookies 3)Pretzels 4)Candy");
                int snackOption = scanner.nextInt();

                if(snackOption == 1) {
                    System.out.println("Chips are selected");
                } else if (snackOption == 2) {
                    System.out.println("Cookies are selected");
                } else if (snackOption == 3) {
                    System.out.println("Pretzels are selected");
                } else if (snackOption == 4) {
                    System.out.println("Candy is Selected");
                } else {
                    System.out.println("Invalid Products");
                }
                break;

            case "Drinks":
                System.out.println("Pic the dring number:\n1)Juice 2)Soda");
                int drinkOption = scanner.nextInt();

                if(drinkOption == 1){
                    System.out.println("Giving juice");
                } else if (drinkOption == 2) {
                    System.out.println("Give Soda");
                } else {
                System.out.println("Invalid Product");
                break;
            }
        }
    }
}
