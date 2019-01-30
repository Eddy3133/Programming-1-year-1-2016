/**NAME: Edirin Okpikpi
 * STUDENT NUMBER: 3078828
 * Assignmet: 4
 */

import java.util.Random;
public class Assignment4Q1
{
    public static void main(String[] args){
        Random cube = new Random();
        int sum = 0;
        int y = 0;
        System.out.println("Toss number\tToss value\tRunning sum");
         do{
            y++;
            int toss = cube.nextInt(6) + 1;
            sum += toss;
            System.out.println(y+"\t\t"+toss+"\t\t"+sum);
        }while(sum<=30);
    }
}