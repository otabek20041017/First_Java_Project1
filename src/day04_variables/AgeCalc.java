package day04_variables;

import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        /*
        define your birth year variable
        calculate the age
         */
        Scanner scanner = new Scanner(System.in);

        int birthYear = 2022;
        int age = birthYear - 2004;
        System.out.println(age);
    }
}
