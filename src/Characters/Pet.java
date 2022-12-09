package Characters;

import java.util.Objects;

public abstract class Pet extends Character{
    private String ownerName;
    public Pet(String name, String ownerName){
        super(name);
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public boolean belongTo(Person person){
        return person.getName().equals(ownerName);
    }
    @Override
    public int hashCode(){
        return super.hashCode() + 3 * Objects.hash(ownerName);
    }

    @Override
    public String toString() {
        return super.toString()+
                "[ownerName="+ownerName+"]";
    }
}
