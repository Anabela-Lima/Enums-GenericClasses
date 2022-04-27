package GenericClassExercise;

public class Dog {


    protected  String Name;
    protected  String Owner;
    protected  Boolean isVaccinated;

    public Dog(String name, String owner, Boolean isVaccinated) {
        Name = name;
        Owner = owner;
        this.isVaccinated = isVaccinated;
    }
}
