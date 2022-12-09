package Characters;

public class Gunilla extends Person implements Exasparating{
    public Gunilla(String name){
        super(name);
    }
    public void laugh(){
        System.out.println("Гунилла расхохоталась.");
    }
    public void notBelieve(Person person){
        System.out.println(getName()+" сказала персонажу "+person.getName()+", что это выдумки.");
    }
    @Override
    public void exasparate(Person person){
        if (person instanceof Irritable){
            ((Irritable) person).loseTemper();
            System.out.println(getName()+" смогла вывести "+person.getName()+" из себя.");
        }
    }
}
