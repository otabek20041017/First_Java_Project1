package replit;

public class test {
    public static void main(String[] args) {

        String email = "otabek-yusupov@mail.ru";

        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1,6);
        String dashScore = email.substring(6, 7);
        String lastName = email.substring(7,8).toUpperCase() + email.substring(8, 14);
        String indexOfAt = email.substring(14,15);
        String domain = email.substring(15,19);
        String dot = email.substring(19,20);
        String ru = email.substring(20);

        System.out.println("First Name: " + firstName + " \nDash Score: " +dashScore + "\nLast Name: " + lastName +
                "\nIndex of At: " + indexOfAt + "\n" + domain + "\nDot: " + dot + "\nRu: " + ru);


        // domain - (mail)
    }
}
