package Units;

public class Shelf extends Unit implements Lieable{
    public Shelf(String name) {
        super(name);
    }
    @Override
    public String lieOnIt(){
        return "лежал на " + getName();
    }
}
