package replit;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        /*
        Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com

Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase. Output in the following format:

First name: $first name
Last name: $last name
Domain: $domain

Hint: Think about how to use substring and indexOf together

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation
         */
        /*
        Ex:
  Input:
    sergey_brin@gmail.com

  Output:
    First name: Sergey
    Last name: Brin
    Domain: Gmail
         */

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        String firstName = email.substring(0).toUpperCase().substring(0, 6);
        String lastName = email.substring(7, 11).toUpperCase();
        String domain = email.substring(12, 17).toUpperCase();
        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nDomain: " + domain);

    }
}
