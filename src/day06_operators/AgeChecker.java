package day06_operators;

public class AgeChecker {
    public static void main(String[] args) {

        int age = 17;

        boolean isChild = age <= 17;
        boolean isSenior = age >= 65;
        System.out.println("isChild = " + isChild);
        System.out.println("isSenior = " + isSenior);
    }
}
