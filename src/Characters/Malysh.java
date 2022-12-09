package Characters;

public class Malysh extends Person implements Irritable{
    public Malysh(String name){
        super(name);
    }
    public void loseTemper(){
        setMood(Mood.EXASPARATED);
    }
    public void tellAboutSmn(Person person){
        System.out.println(getName()+" рассказывал о "+person.getName()+".");
    }
    public void beForsedTo(){
        System.out.print(getName()+" был вынужден");
    }
    public void punch(Person person){
        System.out.println(" стукнуть "+person.getName()+".");
    }
    public void play(Pet pet){
        System.out.println(getName()+" играет с "+pet.getName()+".");
    }
    public String joy(){
        setMood(Mood.HAPPY);
        return " обрадовался";
    }
    public void see(Character chr){
        if (chr instanceof Pet){
            Pet pet = (Pet) chr;
            System.out.println("Увидев щенка по имени " + pet.getName() + ", " + getName() + joy() + ".");
        }
        else System.out.println(getName()+"увидел "+chr.getName()+".");
    }
    public void forget(Character chr){
        if (getMood() == Mood.HAPPY){
            System.out.println("От радости, "+getName()+" совсем забыл о "+chr.getName());
        }
        else System.out.println(getName()+ " забыл о" + chr.getName());
    }
    public void think(String thought){
        System.out.println("\"" + thought + "\", - подумал " + getName());
    }
    public void pat(Pet pet){
        System.out.println(getName()+" обнимает и гладит "+pet.getName() + ".");
    }
}
