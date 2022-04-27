package CustomClass;

import _2_generics.List.Person;

public class main {

    public static void main(String[] args) {

        // Created generic class

        GenericClass<Person, String> genericClassRefVariable = new GenericClass<>();
        genericClassRefVariable.useGenerics(new Person(), "");

    }
}
