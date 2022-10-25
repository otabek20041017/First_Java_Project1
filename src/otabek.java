import java.util.Scanner;

public class otabek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (word.length() % 2 == word.length()) {
            System.out.println(word);
        }
    }
}
