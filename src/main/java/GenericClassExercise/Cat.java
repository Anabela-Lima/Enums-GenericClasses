package GenericClassExercise;

import javax.naming.Name;

public class Cat {

    protected  String Name;
    protected  String Owner;
    protected  Boolean isVaccinated;

    public Cat(String name, String owner, Boolean isVaccinated) {
        Name = name;
        Owner = owner;
        this.isVaccinated = isVaccinated;
    }
}
