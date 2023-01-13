import characters.*;
import units.*;

public class Main {
    public static void main(String[] args) {
        Karlson karlson = new Karlson("Карлсон", "Винт от AttackHelicopter");
        Malysh malysh = new Malysh("Малыш");
        Gunilla gunilla = new Gunilla("Гунилла");
        Christer christer = new Christer("Кристер");
        Effa effa = new Effa("Еффа");
        School school = new School("Школа");
        Shelf shelf = new Shelf("Полка");
        Malysh.street = new Person.Place("улица");
        Malysh.schoolClass = new Person.Place("классе");
        Malysh.Shihka shihka = malysh.new Shihka();

        malysh.closeCloset();
        Person.comeTo(malysh, gunilla, christer);
        Person.liveWhere(Malysh.street, gunilla, christer);
        Person.studyWhere(Malysh.schoolClass, gunilla, christer);
        malysh.like(gunilla);
        malysh.like(christer);
        malysh.forgive(shihka);
        Person.fight(malysh, christer);
        Person.fight(malysh, Malysh.street);
        try {
            malysh.punch(gunilla);
        } catch (MalyshException exception) {
        }
        gunilla.exasparate(malysh);
        school.comeBack(Day.YESTERDAY, malysh, gunilla, christer);
        malysh.tellAboutSmn(karlson);
        gunilla.laugh();
        gunilla.notBelieve(malysh);
        christer.agree(gunilla);
        malysh.beForsedTo();
        malysh.setMood(Mood.HAPPY);
        malysh.punch(christer);
        christer.cast(new Ejectable() {
            @Override
            public String eject() {
                return "камень";
            }
        }, malysh);
        malysh.setMood(Mood.NORMAL);
        malysh.visitedBy(gunilla, christer);
        try {
            christer.bring(effa);
        } catch (OwnerException e) {
            System.out.println(effa.getName() + " не пошла с " + christer.getName() + ", потому что он не хозяин.");
        }
        malysh.see(effa);
        malysh.forget(karlson);
        karlson.lieOn(shelf);
        malysh.think("Ничего нет на свете лучше собаки");
        effa.carees();
        malysh.pat(effa);
        christer.standBy(malysh, effa);
        christer.watch(WStatus.ABSCALM, malysh, effa);
        christer.knowWhoOwner(effa);
        christer.allow(malysh);
        malysh.play(effa);
    }
}