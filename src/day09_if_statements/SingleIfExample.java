package day09_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if (true) {
            System.out.println("break");
        }

        if (true) {
            System.out.println("Bye"); // boolean was false, this will NOT run

        }

        System.out.println("----------------------");

        int year = 2022;

        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hand");
            System.out.println("social distance");
        }
        System.out.println("---------------");

        double price = 39.99;

        if (price >= 20) {
            System.out.println("Free shopping");
        }

        System.out.println("-------------");
    }
}
