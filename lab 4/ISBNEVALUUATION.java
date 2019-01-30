/** EDIRIN OKPIKPI
 * 3078829
 * lab 4
 */
import java.util.Scanner;

public class ISBNEVALUUATION
{
    public static void main (String[] args){
        Scanner yeah =new Scanner (System.in);
        System.out.println("Please, enter an ISBN-10");
        String isbn = yeah.next();
        System.out.println("ISBN is"+isbn);
        while (! isbn.equals("0")) {
            int addition=0;
            boolean valid = true;
            
            for (int klm=0; klm<isbn.length()-1; klm++){
                char o = isbn.charAt(klm);
                int j = Character.getNumericValue(o);
                addition=addition+j*(klm+1);
            } 
            int j = Character.getNumericValue(isbn.charAt(9));
            if (isbn.charAt(9)=='X'){
                addition = addition+ 10*10;}
            else 
            {addition = isbn.charAt(9)*10;}
            
            
            if (addition%11 ==0) {
                System.out.println(isbn+" it is  valid");
            }
            else {
                System.out.println(isbn+" it is not valid");
            }
           
                
            System.out.println("Please, enter an isbn");
            isbn= yeah.next();
        }
    }
}



