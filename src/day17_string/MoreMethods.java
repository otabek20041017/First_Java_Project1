package day17_string;

public class MoreMethods {
    public static void main(String[] args) {

        // isEmpty()

        String s = "hello";
        System.out.println(s.isEmpty());

        String s2 = " ";
        System.out.println(s2.isEmpty());

        String s3 = ""; // empty space, String but no characters
        System.out.println(s3.isEmpty());

        // isBlank()

        String b = "";
        System.out.println(b.isEmpty()); // checks if there is characters
        System.out.println(b.isBlank()); // checks for non space characters

        String c = "";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());

        // replace
        String str = "java";
        //str = str.replace('a', 'z');
        System.out.println(str.replace("a","z"));

        String str2 = "a apple path";
        System.out.println(str2.replace("a", "(a)"));

        // common use case: delete spaces
        String str3 = " multiple words here ";
        System.out.println(str3.trim());
        str3 = str3.replace(" ", "");
        System.out.println(str3);

        // replacing only first
        String z = "wooden spoon";
        System.out.println(z.replace("o", "-"));
        System.out.println(z.replaceFirst("o", "-"));

        // how to replace middle character only

        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO = ex.indexOf('o', firstO + 1);
        System.out.println(ex.substring(0, secondO));
        System.out.println(ex.substring(secondO).replaceFirst("o", "-"));
        System.out.println(ex.substring(0, secondO) + ex.substring(secondO).replace("o","-"));

    }
}
