package day21_nested_loops;

public class BiggestSubstring {

    public static void main(String[] args) {
        /*
        Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it

    Ex:

        Input:
            aaabbbcccccddddee
        Output:
            cccc
         */

        String str = "aaabbbcccccddddeeeee";
        String longest = ""; // cccc
        String each = ""; //

        for (int i = 0; i < str.length() - 1; i++) {

            each += str.charAt(i); // adds the characters at index i so the String each

            if (i == str.length() - 2 && str.charAt(i) != str.charAt(i + 1)) { // if the current character is not equal
                each += longest;
                if (each.length()  > longest.length()) {
                    longest = each; // if you  find a longer substring, assign it to the longest variable
                }

                each = ""; // resetting for the next part
            }

            if (i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1)) {
               
               if (each.length() > longest.length()) {
                   longest = each;
               }
            }

        }
        System.out.println(longest);
    }
}





