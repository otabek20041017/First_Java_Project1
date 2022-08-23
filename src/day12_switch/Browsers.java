package day12_switch;

public class Browsers {
    public static void main(String[] args) {

        String browser = "arzon";


        switch (browser) {
            case "chrome":
                System.out.println("opening google in chrome");
                break;
            case "firefox":
                System.out.println("opening goo in fire fox");
                break;
            case "safari":
                System.out.println("Special set up or apple computers");
                System.out.println("Opening in Safari");
                break;

            default:
                System.out.println("Opening in chrome by default");
        }

    }
}
