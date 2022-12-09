import Characters.*;
import Units.*;

public class Main {
    public static void main(String[] args) {
        Karlson karlson = new Karlson("Карлсон", "Винт от AttackHelicopter");
        Malysh malysh = new Malysh("Малыш");
        Gunilla gunilla = new Gunilla("Гунилла");
        Christer christer = new Christer("Кристер");
        Effa effa = new Effa("Еффа");
        School school = new School("Школа");
        Shelf shelf = new Shelf("Полка");
        gunilla.exasparate(malysh);
        school.comeBack(Day.YESTERDAY, malysh, gunilla, christer);
        malysh.tellAboutSmn(karlson);
        gunilla.laugh();
        gunilla.notBelieve(malysh);
        christer.agree(gunilla);
        malysh.beForsedTo();
        malysh.punch(christer);
        christer.cast((Ejectable) new Rock("камень"), malysh);
        malysh.setMood(Mood.NORMAL);
        malysh.visitedBy(gunilla, christer);
        christer.bring(effa);
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