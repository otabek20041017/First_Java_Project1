package day05_arithmetic_operators;

public class Employer {
    public static void main(String[] args) {
        /* declare and assign these variables with the most appropriate datatypes:

        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at Current benefits include $1000000 salary a year, 20 PTO days and work from home.

---------------------------------------------------------------------------------
         */
        String firstName = "Otabek";
        String lastName = "Yusupov";
        String companyName = "MI6";
        String jobTitle = "Secret Agent";
        char suite = 'E';
        int empolyeeID = 7;
        int numberOfPTO = 15;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + empolyeeID + '@' + companyName + ".com";
        String benefits = "$" + salary + "salary a year, " + numberOfPTO + "PTO days and WFH";

        String summary = " Employee Information for " + fullName + ". " + jobTitle + " for " + companyName + ", based in suite " + suite + "Mr/Mrs " + lastName + " is full time" + isFullTime + ".Contact Mr/Mrs " + lastName + " at " + email + ".Current benefit include" + benefits;

        System.out.println(summary);
    }
}
