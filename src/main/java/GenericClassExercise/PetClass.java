package GenericClassExercise;

public class PetClass<Cat , Dog > {  // the generic class accepts objects of datatype Cat

    public void useGenerics(Cat c, Dog d){

        System.out.println(" Datatype for c object is: " + c.getClass());    // datatype for c object is :
        System.out.println(" Datatype for d object is " + d.getClass());    // datatype for d object is

    }
}
