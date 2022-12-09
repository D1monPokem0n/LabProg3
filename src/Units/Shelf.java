package Units;

public class Shelf extends Unit implements Lieable{
    public Shelf(String name) {
        super(name);
    }
    @Override
    public String lieOnIt(){
        return "лежал на " + getName();
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
