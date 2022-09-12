package day43_abstraction.learning;

public interface Mac {

    String brand = "Apple"; // the keywords are grey, because you don't need them
    String os = "IOS"; // public static final String os = "IOS;

    // brand and os are both public static final variables
    // instance variables(non static) is not allowed in interface

    // methods: in interface you can define abstract methods(which are default), static, default

    void turnOn(); // public abstract void turnOn();

    public static void getBrand() { // public is grey because. everything is public by default
        System.out.println("The brand is Apple");
    }

    public default void typing() { // default allows us to create a method with implementation in the interface. It is NOT the default access modifier. This is an instance method for the class that implements
        System.out.println("Typing on apple keyboard");

    }

}
