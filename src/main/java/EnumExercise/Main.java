package EnumExercise;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        // Check enum using if statement

        DryerTemperature dryerTemperature = DryerTemperature.LOW;   // creating a new dryertemperature of instance LOW



        // if the DryerTemperature instance is High
        if (dryerTemperature == DryerTemperature.HIGH){

            // print the following statement:
            // (NOTE: it shouldnt print this line because the DryerTemperature instance we created
            // is LOW )
            System.out.println("You are blowdrying  your hair on a High temperature!- CAREFUL!");

        }


        // check enum using switch

        // breaks prevent you from falling through the next lines of code but it will print previous lines until
        // we reach desired case of dryerTemperature. IF we dont write breaks, it will print all the lines even if we
        // have arrived at dryerTemperature LOW (temperatue we used when we created  a new dryertemperature : line 11)


        switch (dryerTemperature){

            case LOW:
                System.out.println("You are blowdrying  your hair on a low temperature!");
                break;

            case MEDIUM:
                System.out.println("You are blowdrying  your hair on a medium temperature!");
                break;

            case HIGH:
                System.out.println("You are blowdrying  your hair on a High temperature!- CAREFUL!");

            default:
                System.out.println("I do not recognise this dryerTemperature! use LOW, MEDIUM, or HIGH");


        }


    }
}
