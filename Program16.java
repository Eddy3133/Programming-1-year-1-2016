/**EDIRIN OKPIKPI
 * 3078829
 * LAB 5
 */

import java.util.Scanner;
public class Program16
{
    public static void main(String[] args){
      System.out.println("enter a set of numbers:");
        Scanner ty = new Scanner(System.in);

        int small = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        
        small = largest = ty.nextInt();
        for (int k=0; k<10; k++){
             int mb= ty.nextInt();
            if (small > mb) {              
                small = mb;

            }
            
            if(largest < mb ) {
                largest = mb;  
            }
            
        }

       
    
    System.out.println("the smallest number is" + small);
    System.out.println("the largest number is" + largest);
}
}
