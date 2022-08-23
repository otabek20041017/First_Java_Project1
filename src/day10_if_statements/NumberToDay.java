package day10_if_statements;

import java.util.Scanner;

public class NumberToDay {
    /*
    create a number to prepresent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

    Ex:
        2
        Tuesday

    Ex:
        5
        Friday
     */


        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println("Enter first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter second number: ");
            int num2 = input.nextInt();
            System.out.println("Enter third number: ");
            int num3 = input.nextInt();

            if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
                System.out.println("middle number is: " + num1);
            }else if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
                System.out.println("middle number is: " + num2);
            }else {
                System.out.println("middle number is: " + num3);
            }


        }
    }