import classes.*;
import enums.Material;
import exceptions.IllegalPeopleNumber;


public class Main
{
    public static void main(String[] args)
    {
        Male prince = new Male("принц");
        King king = new King("король");
        Ring ring = new Ring("кольцо", Material.GOLD);
//        Female peasant = new Female("крестьянка");
        Female princess = new Female("принцесса");

        prince.say("""
                -мой любезный отец, посмотрите на это колечко,
                оно даст мне выздоровление и исцелит от печали.""");

//        ring.heal(prince);

        prince.say("""
                -я хочу жениться на девушке, которой это колечко будет впору,
                и неважно кто она - принцесса или самая бедная крестьянка.""");

        king.lookAt(ring);
        king.grab(ring);
//        king.takeOut(ring);

        king.sendOut(new Male("глашатай"), -100);
        king.sendOut(new Male("барабанщик"), 100);

        king.makeDecree(new Decree("-та девушка, на пальчик которой наденется золотое колечко, станет невестой принца."));

        prince.proposeTo(princess, ring);


    }
}


