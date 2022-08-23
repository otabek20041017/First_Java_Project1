package day35_custom_classes.traffic;

public class Road {

    public static void main(String[] args) {
        
        TrafficLight light = new TrafficLight("green");
        //light.color = "red";
        System.out.println(light.color);

        // invalid case:
        TrafficLight light2 = new TrafficLight("blue");
        System.out.println(light2.color);
    }
}
