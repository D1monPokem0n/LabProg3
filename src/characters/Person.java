package characters;

public abstract class Person extends Character {
    public static Place street;
    public static Place schoolClass;
    private Mood mood;

    Person(String name) {
        super(name);
        mood = Mood.NORMAL;
    }

    public void visitedBy(Person... guest) {
        if (guest.length == 1) {
            System.out.println(guest[0].getName() + "пришёл в гости к" + getName());
        } else {
            System.out.println("они пришли к " + getName() + " в гости.");
        }
    }

    ;

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
        if (mood == Mood.NORMAL) {
            System.out.print("Как ни в чём не бывало ");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "[mood=" + mood + "]";
    }

    public static void comeTo(Person owner, Person... guests) {
        if (guests.length == 2) {
            System.out.println("В комнату вошли " + guests[0].getName() + " и " + guests[1].getName() + ".");
        } else {
            System.out.println("К " + owner.getName() + "пришли.");
        }
    }

    public static class Place {
        private String name;

        public Place(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void liveWhere(Place place, Person... persons) {
        System.out.println("Они жили на той же " + place.getName() + ", что и Малыш.");
    }

    public static void studyWhere(Place place, Person... persons) {
        System.out.println("Они учились в одном " + place.getName() + ".");
    }

    public static void fight(Person person1, Person person2) {
        System.out.println(person1.getName() + " частенько дрался с " + person2.getName() + ".");
        if (person1.getName().equals(person2.getName())) {
            System.out.println(", но они тут же мирились.");
        }
    }

    public static void fight(Person person, Place place) {
        System.out.println("Впрочем, " + person.getName() + " дрался почти со всеми ребятами с " + place.getName() + ".");
    }

}
