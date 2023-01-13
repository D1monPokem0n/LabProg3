package characters;

import java.util.Objects;

public abstract class Pet extends Character {
    private String ownerName;

    public Pet(String name, String ownerName) {
        super(name);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean belongTo(Person person) {
        return person.getName().equals(ownerName);
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Pet other = (Pet) otherObject;
        return getName().equals(other.getName()) &&
                getOwnerName().equals(other.getOwnerName());
    }

    @Override
    public int hashCode() {
        return 3 * Objects.hash(ownerName, getName());
    }

    @Override
    public String toString() {
        return super.toString() +
                "[ownerName=" + ownerName + "]";
    }

}
