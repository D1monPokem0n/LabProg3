package Characters;

public class Effa extends Pet{
    public Effa(String name){
        super(name, "Кристер");
    }
    public void carees(){
        System.out.println(getName() + " прыгала и лаяла.");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
