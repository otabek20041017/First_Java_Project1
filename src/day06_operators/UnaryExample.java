package day06_operators;

public class UnaryExample {
    public static void main(String[] args) {

        int n = 0;      // 0
        n++;        // 1
        System.out.println(n); // 1
        ++n;        // pre increment, value becomes 2
        System.out.println(n); // 2

        System.out.println(++n); // pre increment, value becomes 3, then it prints the value

        System.out.println(++n); // pre increment, value become 4, then it prints the value

        System.out.println(n);
        System.out.println("post number:");

        System.out.println(n++); // post increment, prints

        System.out.println(n);


        System.out.println("-----------------------");

        int x = 4;
        int y = x;
        int z = --x;
        System.out.println("x " + x); // 4 --> 5
        System.out.println("y " + y); // 4
        System.out.println("z " + z); // 5

    }
}
