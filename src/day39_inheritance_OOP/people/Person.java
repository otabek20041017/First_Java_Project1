package day39_inheritance_OOP.people;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        // super() -> calls the parent constructor
        this.name = name;
        this.age = age;
    }
}