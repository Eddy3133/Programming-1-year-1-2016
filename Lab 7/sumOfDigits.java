/**NAME: OKPIKPI EDIRIN
 * STUDENT NUMBER: 3078829
 * LAB7
 */
import java.util.Scanner;
public class sumOfDigits
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        
        System.out.println("enter an integer");
        int y = kb.nextInt();
        System.out.println("you entered "+y);
        int total = addDigits(y);

        System.out.println("sum2 of digits is "+total);
    }

    public static int addDigits (int theNumber){
        int add = 0;
        
        while (theNumber != 0){
            add += theNumber % 10;
            theNumber = theNumber/10;
        }
        return add;
    } 
}
