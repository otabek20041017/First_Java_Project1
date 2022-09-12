package day42_abstraction.person;

import com.sun.source.doctree.TextTree;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {
    public static void main(String[] args) {
     // cannot create objects of the Abstract classes
        //Person obj = new Person();
        //Employee obj2 = new Employee();

        Tester otabek = new Tester("Otabek",17,"SDET", 100_000);
        System.out.println(otabek);

        otabek.sleep(8);
        otabek.work();

        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(otabek);
        testers.addAll(Arrays.asList(
                new Tester("Otabek", 17, "SDET", 100_000),
                new Tester("Mukhammad-Ali", 24, "Senior SDET", 350_000),
                new Tester("Behruzbek", 20, "SDET", 200_000)
        ));
        System.out.println();

        for (Tester each: testers) {
            System.out.println(each);

            each.sleep(8);
            System.out.println();
        }
    }
}
