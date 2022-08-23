package day15_string;

public class Email {

    /*

        saim@cydeo.com

        name -> saim
        domain -> cydeo


     */
    public static void main(String[] args) {

        String email = "saim@cydeo.com";
        int indexOfAt = email.indexOf('@');
        String name = email.substring(0, indexOfAt);
        //System.out.println(name);
        int indexOfDot = email.indexOf('.');
        String domain = email.substring(indexOfAt + 1, indexOfDot);

        System.out.println("Full Email: " + email);
        System.out.println("Name part: " + name);
        System.out.println("Domain part: " + domain);

    }
}
