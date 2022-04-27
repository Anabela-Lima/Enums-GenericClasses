package org.example;

public class Main {

    public static void main(String[] args) {

        // check enum using if

        Season season = Season.SUMMER;

        if (season == Season.SUMMER) {
            System.out.println("Spring time!");

        }


        // check enum using switch

        // breaks prevent you from falling through the next lines of code

        switch (season) {
            case SPRING:
                System.out.println("Spring time!");
                break;
            case SUMMER:
                System.out.println("Summer time!");
                break;
            case FALL:
                System.out.println("Fall time!");
                break;
            case WINTER:
                System.out.println("Winter is coming!");
                break;
            default:
                System.out.println("I don't recognize this season!");


                // When you run the main, we will switch through seasons, is it Spring= Summer? no, next line,
                // it will still print, next, is summer =summmer yes, print. then we stop. because we have found summer


        }
    }

}
