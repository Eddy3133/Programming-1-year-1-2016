/**
 * LAB 3
 * 
 * EDIRINVERERE OKPIKPI
 * 3078829
 */

   import java.util.Scanner;
   public class CONVERTION
   {
       public static void main ( String[]args){
           Scanner type=new Scanner(System.in);
           
           double CAN,CAN2,EX,TYPO, USAD;
           System.out.println("\n Enter Exchange Rate");
           EX =type.nextDouble();
           
           System.out.println("First Value in Canadian Dollars");
           CAN= type.nextDouble();
           
           System.out.println("Increment Value");
           TYPO=type.nextDouble();
           
           System.out.println(" Last Value in Canadian Dollars");
           CAN2= type.nextDouble();
           
           if(TYPO==0){
               TYPO=1;
           }
            System.out.println("\t Canadain \t USdollars");
            
            for( double Canadian =0 ;CAN<=CAN2; Canadian ++){
                USAD=CAN*EX;
                System.out.println("\t" + CAN + "\t "+ USAD );
                CAN=CAN+TYPO;
            }
        }
    }