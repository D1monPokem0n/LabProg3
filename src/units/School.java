package units;

import characters.Person;

public class School extends Unit {
    public School(String name) {
        super(name);
    }

    public void comeBack(Day day, Person... person) {
        String time = switch (day) {
            case TODAY -> "Сегодня";
            case TOMORROW -> "Завтра";
            case YESTERDAY -> "Вчера";
        };
        String who = switch (person.length) {
            case 1 -> person[0].getName();
            case 2 -> person[0].getName() + "и" + person[1].getName();
            case 3 -> "они втроём";
            default -> "они";
        };
        String message = time + ", " + who + " возвращались со " + getName() + ".";
        System.out.println(message);
    }

    @Override
    public void getInfo() {
        System.out.println("Школа, в которой учились ребята");
    }
}
