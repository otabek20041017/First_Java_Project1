package day13_switch_string;

import java.util.Scanner;

public class DaysInMonths {
    /*
    Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in tha month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May. July, August, October, December: 31 days


     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month = input.nextLine();

        switch (month){

            case "February":
                System.out.println("28 days");
                break;
            case "April":
            case "June":
            case "September":
            case "Novmber":
                System.out.println("30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            default:
                System.out.println("Invalid Month");

        }


    }
}
