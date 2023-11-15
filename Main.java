import Characters.*;
import enums.Animals;
import enums.Things;

public class Main
{
    public static void main(String[] args)
    {
        Neznayka m = new Neznayka("Незнайка", 15, 150);
        System.out.println(m.toString());
        m.say_hello();
        m.TooSleep();
        m.Attack();
        m.Hide();
        m.Fight();
        m.NameWhatItIs(Animals.BUGS, Things.GARBAGE);
        m.GoAfk();
        m.NameANewAnimal(Animals.DINOSAURS);
    }
}
