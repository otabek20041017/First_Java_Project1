package day28_methods;

public class CharMethods {
    /*
    Character Methods

    Print each one in one line

    - make method that will print all the letters from A to Z

    - make method that will print all the letters from a to z

    - make method that will print all the letters from Z to A

    - make method that will print all the letters from z to a

    - make method that will print all the letters from 0 to 9

     */

    public static void getUpperAtoZ() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println(); // break the next line
    }

    public static void getLowerAtoZ() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println(); // break the next line
    }

    public static void getUpperCaseZtoA() {
        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }
        System.out.println(); // break the next line
    }

    public static void getLowerCasezToa() {
        for (char letter = 'z'; letter >= 'a'; letter--) { // int i = 'z'; or int i = 122
            System.out.print(letter + " "); // print((char)i)
        }
        System.out.println(); // break the next line
    }

    public static void getNumbersfrom0To9() {
        for (char numbers = '0'; numbers <= '9'; numbers++) {
            System.out.print(numbers + " ");
        }
        System.out.println(); // break the next line
    }

    public static void main(String[] args) {
        getUpperAtoZ();
        getLowerAtoZ();
        getUpperCaseZtoA();
        getLowerCasezToa();
        getNumbersfrom0To9();

    }


}
