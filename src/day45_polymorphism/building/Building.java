package day45_polymorphism.building;

public abstract class Building {

    String location;
    double price;

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public abstract void pay();

    public String toString(){
        return  "Location: " + location + ", price: " + price;
    }

    /*
    Create an abstract class Building

    create instance variables
        String location
        double price

    create abstract method
        void pay()

    create a constructor to assign the location & price

    override the toString to print the location & price
     */
}
