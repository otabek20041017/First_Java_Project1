package homeworks;

import java.util.Scanner;

public class ScannerHomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        System.out.println(num1 + num2); // input.nextInt(); + input.nextInt();rt
    }
}
