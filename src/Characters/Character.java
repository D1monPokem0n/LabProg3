package Characters;
import Units.*;

import java.util.Objects;

public abstract class Character {
    private String name;
    public String getName(){return name;}
    Character(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return getClass().getName() + "[name="+name+"]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Character other = (Character) otherObject;
        return name.equals(other.getName());
    }

}
