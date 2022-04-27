package _2_generics.List;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList nonGenericList = new ArrayList();    // generics prevent us from adding wrong objects to the list

        // each class in java is also an object, inherits properties from e.g. object superclass (built in) thats why
        // we can do things like .add etc


      // non generic list that accepts every object- adding different data types to the nonGenericList ArrayList
        nonGenericList.add(1);  // adding integer datatyoe
        nonGenericList.add("String"); // adding String datatype
        nonGenericList.add(new Person());  // adding Person datatype
       //  Exception in thread "main" java.lang.ClassCastException when trueied to run


//--------------------------------------------

//        assigning our reference variable to type object - see 2hrs

        Object object = nonGenericList.get(1);  // we assume that at position 1 of list we have object of type
                                                // person which may not be true but we can do casting
        Person person = (Person) object; // casting object to person

        // calling person method to person type object
        person.personMethod();



        // create generic list  < what type of data goes in>

        ArrayList<Person> personTypeOnly = new ArrayList<>();
//        personTypeOnly.add(1)-- compiler is not happy- cant add integer to Arraylist that only accepts data type person
        personTypeOnly.add(new Person());
//        personTypeOnly.add.add( "")- compiler is not happy- cant add integer to Arraylist that only accepts data type person

    }



}
