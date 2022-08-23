package homeworks;
import java.util.*;

public class SecondsCoverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        System.out.println("Enter your email");
        String email = input.nextLine();
        System.out.println("Enter your street");
        String street = input.nextLine();
        System.out.println("Enter your city");
        String city = input.nextLine();
        System.out.println("Enter your state");
        String state = input.nextLine();
        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();
        System.out.println("Enter your work phone number");
        int phoneNumber = input.nextInt();
        System.out.println("Enter your personal phone number");
        int personalPhoneNumber = input.nextInt();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your height");
        double height = input.nextDouble();
        System.out.println("Are you married");
        boolean married = input.nextBoolean();


    }
}