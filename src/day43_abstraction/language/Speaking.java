package day43_abstraction.language;

public class Speaking {
    public static void main(String[] args) {

        English english = new English();
        english.hello();
        english.bye();

        Uzbek uzbek = new Uzbek();
        uzbek.hello();
        uzbek.bye();

        Uyghur uyghur = new Uyghur();
        uyghur.hello();
        uyghur.bye();

        
    }
}
