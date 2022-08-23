package day11_nested;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
            age should be between 0 - 120

            < 1 baby
            2 - 5 toddler
            6 - 13 kid
            14 - 18 young adult
            19 - 30 adult
            31 - 65 middle age adult
            > 65 senior


         */

        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW
        int age = input.nextInt();

        if(age >= 0 && age <= 20) {
            if (age <= 3){
                System.out.println("ineligible");
            } else if (age <= 3 && age <= 4) {
                System.out.println("preschool");
            } else if(age <= 5){
                System.out.println("kindergarten");
            }else if(age <= 6 && age <= 10){
                System.out.println("elementary school");
            }else if(age <= 11 && age <= 13) {
                System.out.println("middle school");
            }else if(age <= 14 && age <= 18){
                System.out.println("high school");
            } else if (age <= 19){
                System.out.println("college");
            } else {
                System.out.println("");
            }
        } else {
            System.out.println(age + "is not a valid age");
        }

    }
}




























