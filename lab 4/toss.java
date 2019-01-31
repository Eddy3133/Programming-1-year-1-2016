/**EDIRIN OKPIKPI
 * 3078829
 * LAB4
 */
import java.util.Random;
/** 
 * EDIRIN OKPIKPI
 * 3078829
 * LaB 4
 */
public class toss
{
    public static void main(String[] args)
    {
        System.out.print("\n\n10 rolls: ");
        Random die = new Random(); 
        for (int i=0; i<10; i++){
            int toss = die.nextInt(6)+1;
            System.out.print(toss	+"   ");
    }
}
}
