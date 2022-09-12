package day43_abstraction.language;

public class Uyghur implements Language {

    @Override
    public void hello() {
        System.out.println("ياخشىمۇسىز");
    }

    @Override
    public void bye() {
        System.out.println("خوش");
    }
}
