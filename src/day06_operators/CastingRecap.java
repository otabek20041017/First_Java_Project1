package day06_operators;

public class CastingRecap {
    public static void main(String[] args) {

        int age = 40;
        long ageLong = age;

        long num = 100;
        int numInt = (int)num;

        long boxes = 30l;

        float f = 14.5f;
        int i = (int)f;
        System.out.println(i);
        double d = f;
        System.out.println(d);

    }
}
