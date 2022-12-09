package Units;

public class Rock extends Unit implements Ejectable{
    @Override
    public String eject() {
        return getName();
    }
    public Rock(String name){
        super(name);
    }
}
