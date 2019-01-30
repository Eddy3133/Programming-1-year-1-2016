/**EDIRIN OKPIKPI
 * 3078829
 * LAB 5
 */

import java.util.Scanner;
public class findthesmall
{
    public static void main(String[] args)
    {
      System.out.println("enter a set of numbers:");
        Scanner ty = new Scanner(System.in);

        int small = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        
        int kl = ty.nextInt();
        while (!(kl==-1)){

            if (kl < small) {              
                small = kl;
            }
            
            if(kl> largest) {
                largest = kl;  
            }
            kl = ty.nextInt();
        }

       
    
    
    System.out.println("the largest number is" + largest);
}
}
