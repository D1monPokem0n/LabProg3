package characters;

public class Malysh extends Person implements Irritable {
    public Malysh.Shihka shihka;

    public Malysh(String name) {
        super(name);
    }

    public void loseTemper() {
        setMood(Mood.EXASPARATED);
    }

    public void tellAboutSmn(Person person) {
        System.out.println(getName() + " рассказывал о " + person.getName() + ".");
    }

    public void beForsedTo() {
        System.out.print(getName() + " был вынужден");
    }

    public void punch(Person person) {
        if (person.getName().equals("Гунилла")) {
            throw new MalyshException();
        }
        System.out.println(" стукнуть " + person.getName() + ".");
    }

    public void play(Pet pet) {
        System.out.println(getName() + " играет с " + pet.getName() + ".");
    }

    public String joy() {
        setMood(Mood.HAPPY);
        return " обрадовался";
    }

    public void see(Character chr) {
        if (chr instanceof Pet) {
            Pet pet = (Pet) chr;
            System.out.println("Увидев щенка по имени " + pet.getName() + ", " + getName() + joy() + ".");
        } else System.out.println(getName() + "увидел " + chr.getName() + ".");
    }

    public void forget(Character chr) {
        if (getMood() == Mood.HAPPY) {
            System.out.println("От радости, " + getName() + " совсем забыл о " + chr.getName() + ".");
        } else System.out.println(getName() + " забыл о" + chr.getName() + ".");
    }

    public void think(String thought) {
        System.out.println("\"" + thought + "\", - подумал " + getName() + ".");
    }

    public void pat(Pet pet) {
        System.out.println(getName() + " обнимает и гладит " + pet.getName() + ".");
    }

    @Override
    public void getInfo() {
        System.out.println("Малыш очень любит собак");
    }

    public class Shihka {
        private String name;
        private String location;

        public Shihka() {
            name = "Шишка";
            location = "на лбу";
        }

        public String getLocation() {
            return location;
        }

        public String getName() {
            return name;
        }
    }

    public void closeCloset() {
        class Closet {
            private String name;

            public Closet(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        Closet cls = new Closet("шкаф.");
        System.out.println(getName() + " едва успел закрыть " + cls.getName());
    }

    public void like(Person person) {
        if (person.getName().equals("Гунилла")) {
            System.out.println(getName() + " очень нравилась " + person.getName() + " и он часто говорил маме какая она \"ужасно хорошая\".");
        } else System.out.println(person.getName() + "а " + getName() + " тоже любил.");
    }

    public void forgive(Shihka shihka) {
        System.out.println("Давно простил ему " + shihka.name + " " + shihka.location + ".");
    }
}
