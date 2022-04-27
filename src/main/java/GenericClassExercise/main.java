package GenericClassExercise;

public class main {

    public static void main(String[] args) {

        // create generic class- accepts both cat and dog datatype objects

       PetClass< Cat, Dog> Pets = new PetClass<>();
       Pets.useGenerics(new Cat("Night", "Ana", true), new Dog("Scott", "Paula", false ));
    }






}
