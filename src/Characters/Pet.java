package Characters;

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
}
