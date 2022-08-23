package day09_if_statements;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a student? T/F");
        boolean isSutdent = input.nextBoolean();
        String report = ""; // empty space, String type

        if (isSutdent) {
            System.out.println("What are you studying?");
            String subject = input.next();
            System.out.println(subject);
        }

        System.out.println("Do you live in a city? T/F");

        if (input.nextBoolean()) {
            System.out.println("Cool, cities are loud and fun");

        } else {
            System.out.println("How many years have you lived in the suburb");
            int years = input.nextInt();
            System.out.println(years);
            report += "\nLiving in suburb for " + years + " years";

        }
        System.out.println(report);

    }
}
