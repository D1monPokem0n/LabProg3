package characters;

public class Effa extends Pet {
    public Effa(String name) {
        super(name, "Кристер");
    }

    public void carees() {
        System.out.println(getName() + " прыгала и лаяла.");
    }

    @Override
    public void getInfo() {
        System.out.println("Еффа был милым щенком");
    }

}
