package day11_nested;

public class ArmyQualifications {
    public static void main(String[] args) {

        /*
        ages: 18 - 35
        high school diploma
        citizen
         */

        int age = 129;
        boolean hasDiploma = true;
        boolean isCitzen = true;

        if ((age > 18 && age <= 35) && hasDiploma && isCitzen) {
            System.out.println("Your Qualify for the Army");
        } else {

            if (age < 0 || age > 120) {
                System.out.println("Not a valid age number");
            } else if (age < 18) {
                System.out.println("You are too young, need to be at least 18");
            } else {
                System.out.println("You are too old, limit is 35 years old");
            }
            // if to check about diploma

            if (!hasDiploma) { // if you don't have a diploma then:
                System.out.println("You need at lease a high school diploma");
            }
            // if to check about citizenship
            if (!isCitzen) {
                System.out.println("You need to be a citizen to apply");
            }
        }
    }
}
