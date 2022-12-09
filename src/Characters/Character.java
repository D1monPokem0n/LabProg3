package Characters;
import Units.*;

public abstract class Character {
    private String name;
    public String getName(){return name;}
    Character(String name){
        this.name = name;
    }
}
