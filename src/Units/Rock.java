package Units;

public class Rock extends Unit implements Ejectable{
    @Override
    public String eject() {
        return getName();
    }
    public Rock(String name){
        super(name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void getInfo(){
        System.out.println("Каменный камень");
    }

}
