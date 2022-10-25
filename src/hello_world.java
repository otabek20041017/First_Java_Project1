import java.util.*;

public class hello_world {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();

        next3(num);
    }
    // DO NOT TOUCH ABOVE
    public static void next3(int number){
        for(int i = 1; i < 4; i++){
            System.out.print(i  + number + " ");
        }

    }
}