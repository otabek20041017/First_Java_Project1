package day16_string;

public class Titles {

    /*
    create a class Title
ask the user to enter their name inluding titles
use the following titles
     */

    public static void main(String[] args) {

        String name = "Ms ";

        name = name.toLowerCase();

        if (name.startsWith("mr") || name.startsWith("mister")) {
            System.out.println("Hello sir");
        } else if (name.startsWith("ms") || name.startsWith("miss") || name.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr")) {
            System.out.println("Hello Doctor");
        }

        if (name.endsWith("sr")) {
            System.out.println("Nice to meet you Seniour");
        } else if (name.endsWith("jr")) {
            System.out.println("Nice to meet you Junior");
        }
    }
}
