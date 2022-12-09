package Units;

public abstract class Unit {
    private String name;
    public String getName(){
        return name;
    }
    public Unit(String name){
        this.name = name;
    }
}
