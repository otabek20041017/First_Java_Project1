package day35_custom_classes.school;

public class School {

    String name;
    int totalNumOfStudents;
    double avgGpa;

    public School(String inputName, int inputStudents, double inputGpa) {
        this.name = inputName;
        this.totalNumOfStudents = inputStudents;
        this.avgGpa = inputGpa;
    }

    
//    public School(String inputName, int inputStudents, double inputGpa) {
//        name = inputName;
//        totalNumOfStudents = inputStudents;
//        avgGpa = inputGpa;
//    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNumOfStudents=" + totalNumOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
