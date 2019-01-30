/**
 * EDIRIN OKPIKPI
 * 3078829
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LAB6Q20
{
    public static void main(String[] args)
    throws FileNotFoundException 
    {
        Scanner p = new Scanner(new File("LAB6Q20.README"));
        int d=1;
        System.out.println("<<<< File Readme.file >>>>");
        while (p.hasNext()){
            String brace = p.nextLine();
            brace = brace.trim();
            System.out.println((d++)+" "+brace);
        }
        System.out.println(
            "<<<< end of listing >>>>");
    }
}