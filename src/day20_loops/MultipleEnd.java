package day20_loops;

public class MultipleEnd {
    /*
    Multiply End

Given a String  and a number return a String that has the ending character duplicated and attached by the number

    Ex:

        Input:
            Hello?
            3
        Out:
            Hello????
    Ex:
        Input:
            java
            5
        Output:
            javaaaaa
     */
    public static void main(String[] args) {

        String str = "hello?";
        int end = 6;

        for (int i = 0; i < end; i++) {  // int i = 1; i <= 3
            str += str.charAt(str.length() - 1); // the character at the last index
        }
        System.out.println(str);

    }
}

























