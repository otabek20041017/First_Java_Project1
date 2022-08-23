package day22_array;

import java.util.*;

public class SelectMonth {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Enter the month number: ");
        int num = input.nextInt();

        if (num >= 1 && num <= 12) { // valid months from 1-12
            System.out.println(month[num - 1]); // to convert the input number to a month index we can subtract by 1 which means if the number was 1 --> 1 - 1 = 0 which means index 0 value will be returned

        } else {
            System.out.println("Invalid month number. Should be 1-12");
        }

        // 3 --> March --> month[2] --> 3 - 1 --> 2
        // 11 --> November --> month[10] --> 11 - 1 -> 1-
    }
}
























































