/**
 * NAME: Okpikpi Edirinverere
 * STUDENT NUMBER: 3078829
 * ASSIGNMENT: 2
 */
import java.util.Scanner;
public class Hectares2SqKm2Sq
{
    public static void main (String[]args)
    {
        int Hectares, Squarekilometers;
        double squaremiles ;

              
        Hectares = 0;
       
        while (Hectares < 100000){

            Hectares = Hectares +1000;
            Squarekilometers = Hectares/100;
            squaremiles= Hectares / 100*.38610;

            System.out.println("\t"+Hectares+"\t"+Squarekilometers+"\t"+squaremiles);
                 
                   
        }

    }

}

