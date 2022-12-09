package Units;

import Characters.Character;

import java.util.Objects;

public abstract class Unit {
    private String name;
    public String getName(){
        return name;
    }
    public Unit(String name){
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getClass().getName()+"[name="+name+"]";
    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Unit other = (Unit) otherObject;
        return name.equals(other.getName());
    }
    public abstract void getInfo();
}
