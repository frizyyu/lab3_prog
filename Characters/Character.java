package Characters;

import interfaces.ToNameInterface;
import interfaces.*;

public abstract class Character implements ToNameInterface, ActionInterface, ChooseAnAttackerInterface {
    String name;
    int age;
    int force;
    public Character(String name, int age, int force){
        this.name = name;
        this.age = age;
        this.force = force;
    }

    public String Return_Spec(){
        return String.format("Имя: %s\nВозраст: %s\nСила: %s\n", name, age, force);
    }

    public abstract void say_hello();

}
