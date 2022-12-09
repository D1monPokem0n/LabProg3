package Characters;

import Units.Lieable;

public class Karlson extends Person implements Lying{
    private String propeller;
    public Karlson(String name, String propeller){
        super(name);
        this.propeller = propeller;
    }
    public void fly(){
        //к сожалению весь текст он спит
    }
    @Override
    public void lieOn(Lieable smth){
        System.out.println(getName() + " " + smth.lieOnIt()+".");
    }
}
