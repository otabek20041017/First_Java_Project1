package day13_switch_string;

import java.util.Scanner;

public class Hotel {
    /*
    Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their part (how many people are staying in the room)

Use those two information to determine the price and room type for the hotel based on the below data:

    party size: 1
    room type: single room
    price: number of days * 100

    party size: 2
    room type: double room
    price: number of days * 125

    party size 3 or 4
    room type: large room
    price: number of days * number of people * 150

    party size 5 or 6, 7
    room type: suite
    price: number of days * number of people * 150

    any other party size:
        Display one message:
            Sorry we don't have any avaliable rooms for that size party

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to the Java hotel! ");
        System.out.println("How many days will you be staying? ");
        int days = scanner.nextInt();
        System.out.println("How many people do you have in your party?");
        int people = scanner.nextInt();
        String roomType;
        double price;

        switch (people){

            case 1:
                roomType = "Single Room";
                price = days * 100;
                break;
            case 2:
                roomType = "Double Room";
                price = days * 125;
                break;
            case 3:
            case 4:
                roomType = "Large Room";
                price = days * people * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "suite";
                price = days * 5000;
                break;
            default:
                roomType = "Sorry we don't have any avaliable rooms for that size party";
                price = -1;
        }
        System.out.println(roomType + " costs: " + price);

    }
}

