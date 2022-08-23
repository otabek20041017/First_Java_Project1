package day13_switch_string;

public class StringObjects {
    public static void main(String[] args) {

        String s = "first"; // String literal, in String pool
        String s2 = new String("Second"); // object in the heap
        System.out.println(s == s2); // compares two different locations

        String s3 = new String("first");
        System.out.println(s == s3); // compares object in two different locations

        String s4 = "second";
    }
}
