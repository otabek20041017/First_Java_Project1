package day26_multi_array;
import java.util.Arrays;
public class Groups {
    public static void main(String[] args) {

        String[][] cydeo = {
                {"Otabek", "Muhammad-Amin", "Shahboz"},
                {"Umidjon", "Abubakr", "Shahboz-Aka", "Ali aka"},
                {"Behruz-aka", "Faridun-aka"},
                {"Izzatillo", "Asadbek", "Sarvar"}

        };

        System.out.println(Arrays.deepToString(cydeo)); // prints the whole 2D array
        System.out.println(cydeo.length); // how many inner, 1d array is there --> How many elements in the 2d Array
        System.out.println(cydeo[2].length); // how many elements in the array at index 2
        System.out.println(cydeo[0][2]); // accessing one specific String element from the inner array at index 0 and giving back the element at index 3
        System.out.println(Arrays.toString(cydeo[1])); // printing the whole inner element array at index 1

        System.out.println();
        // how to loop through each inner array

        for (String[] eachInner : cydeo) { // to loop through a 2d array, the element's type is a 1d array
            System.out.println(Arrays.toString(eachInner));
        }

        System.out.println();
        // how to loop through each name

        for (String[] eacInner : cydeo) {
            for (String eachName : eacInner) {
                System.out.println(eachName);
            }
        }
        System.out.println();
        // how to loop through each name and print the first letter in uppercase
        for (String[] eacInner : cydeo) {
            for (String eachName : eacInner) {
                System.out.println(eachName.substring(eachName.length() - 1).toUpperCase());
            }
        }

    }
}
