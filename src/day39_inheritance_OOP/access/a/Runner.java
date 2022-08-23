package day39_inheritance_OOP.access.a;

public class Runner {
    public static void main(String[] args) {


        //Q: What did I inherit, what do I have access to
        // same package
        Condo condo = new Condo();
        condo.address = "1312 l";
        condo.city = "Chicago";
        condo.state = "IL"; // is inherited because we are in the same package

        // condo.zipcode = zipcode was private s oit doesn't inherit
    }
}
