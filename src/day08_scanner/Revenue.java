package day08_scanner;

import java.util.Scanner;

public class Revenue {
    /*
    Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price quantity


     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item price");
        double price = scan.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Revenue: $" + price * quantity);

    }
}
