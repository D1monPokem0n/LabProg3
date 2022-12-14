package characters;

import units.Lieable;

import java.util.Objects;

public class Karlson extends Person implements Lying {
    private String propeller;

    public Karlson(String name, String propeller) {
        super(name);
        this.propeller = propeller;
    }

    public String getPropeller() {
        return propeller;
    }

    public void fly() {
        //к сожалению весь текст он спит
    }

    @Override
    public void lieOn(Lieable smth) {
        System.out.println(getName() + " " + smth.lieOnIt() + ".");
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropeller(), getName());
    }

    @Override
    public String toString() {
        return super.toString() +
                "[propeller=" + propeller + "]";
    }

    // todo
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Karlson other = (Karlson) otherObject;
        return getName().equals(other.getName()) &&
                getPropeller().equals(other.getPropeller());
    }

    @Override
    public void getInfo() {
        System.out.println("Карлсон спит...");
    }
}
