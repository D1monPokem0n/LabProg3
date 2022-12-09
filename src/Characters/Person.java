package Characters;

public abstract class Person extends Character{
    private Mood mood;
    Person(String name) {
        super(name);
    }
    public void visitedBy(Person ... guest){
        if (guest.length == 1) {System.out.println(guest[0].getName()+"пришёл в гости к"+getName());}
        else {System.out.println("они пришли к "+getName()+" в гости.");}
    };
    public Mood getMood(){
        return mood;
    }
    public void setMood(Mood mood){
        this.mood = mood;
        if (mood == Mood.NORMAL){
            System.out.print("Как ни в чём не бывало ");
        }
    }

}
