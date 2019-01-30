/**
 * EDIRIN OKPIKPI
 * 3078829
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LAB6Q21
{
    public static void main(String[] args)
    throws FileNotFoundException 
    {
        Scanner p = new Scanner(new File("readme.txt"));

        int number=0;
        int numberi=0;
        int numberii=0;

        System.out.println(
            "<<<< File Readme.txt >>>>");
        while (p.hasNext()){
            String brace = p.next().toLowerCase();
            switch(brace){
                case "macbeth": 
                number++;
                break;
                case "duncan": 
                numberi++;
                break;
                case "malcolm": 

                numberii++;
                break;

            }

        }
        System.out.println("\nmacbeth"+" "+number);
        System.out.println("duncan"+" "+numberi);
        System.out.println("malcolm"+" "+numberii);
    }
}
