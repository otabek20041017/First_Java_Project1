package day04_variables;

public class Recap {
    public static void main(String[] args) {

        // declare variables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkilsDays;

        // assigning value of the variables
        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftSkilsDays = 2;
        System.out.println("temperature = " + temperature + " C ");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkilsDays = " + numberOfSoftSkilsDays);

        // declare and assign at same time
        int numberOfCoffeCups = 2;
        float ratingfoMovie = 8.9F; // compiler takes 8.9 as double type, we add to the end to make it the float type
        long waterInOcean = 20000000000000L; // compiler takes 20000000000000 as int type, but this number too big for int, so desn't compile we need
        // to add l to make it a long type

        System.out.println("numberOfCoffeCups = " + numberOfCoffeCups);
        System.out.println("ratingfoMovie = " + ratingfoMovie);
        System.out.println("waterInOcean = " + waterInOcean + " liters ");
    }
}
