package Characters;
import Units.Ejectable;

public class Christer extends Person implements Throwing{
    public Christer(String name){
        super(name);
    }
    @Override
    public void cast(Ejectable smth, Person person){
        System.out.println(getName() + " швырнул в " + person.getName() + " предметом: " + smth.eject());
    }
    public void agree(Person person){
        System.out.println(getName()+" согласился с " + person.getName() + ".");
    }
    public void bring(Character chr){
        if (chr instanceof Pet){
            Pet pet = (Pet) chr;
            if (pet.belongTo(this)) System.out.println(getName()+" привёл своего щенка по имени " + pet.getName() + '.');
            else System.out.println(getName()+" привёл щенка по имени " + pet.getName() + '.');
        }
        else System.out.println(getName()+" и " + chr.getName() + " пришли вдвоём.");
    }
    public void standBy(Character ... chr){
        if (chr.length == 1) {System.out.println(getName() + " стоял рядом с " + chr[0].getName());}
        else System.out.println(getName() + " стоял рядом с ними.");
    }
    public void watch(WStatus ws, Character ... chr){
        String wstatus = switch (ws){
            case CALM -> " спокойно";
            case ABSCALM -> " совершенно спокойно";
            case NERVOUS -> " нервно";
        };
        String who = switch (chr.length){
            case 1 -> chr[0].getName();
            case 2 -> chr[0].getName() + " и " + chr[1].getName();
            default -> "ними";
        };
        String message = getName() + wstatus + " наблюдал за " + who;
        System.out.println(message);
    }
    public void knowWhoOwner(Pet pet){
        if (pet.belongTo(this)) System.out.println(getName() + " знал, что " + pet.getName() + " -- это его собака, а не чья-нибуь ещё.");
        else System.out.println(getName() + " знал, что владелец собаки по имени " + pet.getName() + " -- это " + pet.getOwnerName());
    }
    public void allow(Person person){
        System.out.println(getName() + " позволял " + person.getName() + " делать то, что он делает сколько он хочет.");
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 3;
    }


    @Override
    public void getInfo(){
        System.out.println("Кристер мог метнуть в кого-то камень");
    }

}
