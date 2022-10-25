//package day51_stream;
//
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//public class FilterApplications {
//
//    public static void main(String[] args) {
//
//        Application[] apps = {
//                new Application("Jose Penso", 150_000, true),
//                new Application("Ostap Koziak", 155_000, true),
//                new Application("Ovsanna Abramyan", 250_000, false),
//            new Application("Orkhan Samadzade", 500_000, false)
//        };
//
//        System.out.println(Arrays.stream(apps).filter(person -> person.wilingRecolate).collect(Collectors.toList()));
//        System.out.println(Arrays.stream(apps).filter(person -> person.wilingRecolate).map(p -> p.name).collect(Collectors.toList()));
//        System.out.println(Arrays.stream(apps).filter(Application::isWillingToRelocate).map(Application::t));
//
//    }
//}
//
//class Application {
//    String name;
//    double expectedSalary;
//    boolean wilingRecolate;
//
//    public Application(String name, double expectedSalary, boolean wilingRecolate) {
//        this.name = name;
//        this.expectedSalary = expectedSalary;
//        this.wilingRecolate = wilingRecolate;
//    }
//
//    @Override
//    public String toString() {
//        return "Application{" +
//                "name='" + name + '\'' +
//                ", expectedSalary=" + expectedSalary +
//                ", wilingRecolate=" + wilingRecolate +
//                '}';
//    }
//}
