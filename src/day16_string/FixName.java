package day16_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    /*

        ask the user to enter their first name
        ask the user to enter their last name

        print both mean in proper format

        uppercase first letter + everything lowercase

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First name and Last Name");
        String firstName = input.nextLine();
        String lastName = input. nextLine();

        System.out.println("First name: " + firstName.toUpperCase());
        System.out.println("Last name: " + lastName.toLowerCase());

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
