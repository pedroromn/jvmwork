// ARS : Airline Reservations System

import java.util.Arrays;


public class ARS{
    public static void main(String[] args) {

        boolean[] airplane = new boolean[10];
        Arrays.fill(airplane, false);
        displayAirplane(airplane);
        System.out.printf("%n");
    }

    public static void displayAirplane(boolean[] airplane){
        for(boolean seat : airplane){
            System.out.printf("%b ", seat);
        }
    }

    
} // end of class ARS
