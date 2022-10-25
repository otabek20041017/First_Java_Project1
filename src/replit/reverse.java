package replit;

public class reverse {

    public static void main(String[] args) {
        String originalName = "Otabek";
        String reversedName = "";

        for (int i = 0; i < originalName.length(); i++) {
            reversedName = originalName.charAt(i) + reversedName;


            System.out.println("Reversed Otabek's name: " + reversedName);
        }
    }
}

