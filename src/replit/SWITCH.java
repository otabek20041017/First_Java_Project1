package replit;
import java.util.*;

public class SWITCH {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW
        Scanner input = new Scanner(System.in);
        int balance = 100;
        System.out.println("Hello, which item would you like?");
        String item = input.next();
        switch (item) {
            case "Blanket":
                balance -= 60;
                break;
            case "Charger":
                balance -= 5;
                break;
            case "Hat":
                balance -= 25;
                break;
            case "Headphones":
                balance -= 30;
                break;
            case "Laptop":
                balance -= 200;
                break;
            case "Pants":
                balance -= 50;
                break;
            case "Pillow":
                balance -= 40;
                break;
            case "Smartphone":
                balance -= 1000;
                break;
            case "Socks":
                balance -= 5;
                break;
            case "USB cable":
                balance -= 10;
                break;
            default:
                System.out.println("Sorry, that is an invalid item");
        }

        if (balance < 0) {
            System.out.println("Sorry, not enough funds on your gift card");
        } else {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        }
    }
}

