package day13_switch_string;

import java.util.Scanner;

public class Elevator {
    /*
    add new class Elevator

declare and assign a floor number variable. The floor number represent which floor you want
 the elevator to go to/ After getting to each floow show the information of which companies are on that floor. Use the following data:

    floor 1 --> Lobby, StarBucks, Amazon Pick Up
    floor 2 --> NASA, Cydeo, Discover
    floor 3 --> Uber, Lyft, Chase
    floor 4 --> Rooftop, Lounge

    any other floor value --> Invalid Floor Selected
     */
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int floor = input.nextInt();
        String companies;

        switch (floor) {
            case 1:
                companies = "Lobby, StarBucks, Amazon Pick Up";
                break; // stops the switch
            case 2:
                companies = "NASA, Cydeo, Discover";
            case 3:
                companies = "Uber, Lyft Chase";
                break;
            case 4:
                companies = "Rooftop, Lounge";
                break;
            default: // defined anywhere in the switch, but it will be the case executed if no other case matches

            companies = "Invalid Floor Selected";
        }
        System.out.println("Floor " + floor + ": " + companies);
    }
}
