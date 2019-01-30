/**
NAME: okpikpi Edirin
STUDENT NUMBER: 3078829
ASSIGNMENT 5
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class VOCABS
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        ArrayList <String> arrlist = new ArrayList <String> (); 
        ArrayList <String> omega = new ArrayList <String> (); 
        Scanner f = new Scanner(new File("readme.txt"));
        String eddy = "";
        String CPS = "";
        char beta;
        while (f.hasNext())
            eddy += f.next() + " ";
        for(int i=0; i<eddy.length(); i++)
        {
            beta = eddy.charAt(i);
            if(Character.isWhitespace(beta)||Character.isLetter(beta))
                CPS += beta; 
        }
        Scanner h = new Scanner(CPS);
        int add = 0;
        while(h.hasNext())
        {
            String str = h.next().toLowerCase();
            if(!arrlist.contains(str))
                arrlist.add(str);
            add++;
        }
        int y = arrlist.size();
        String stru="";
        for(int g = 0; g<arrlist.size()-1;){
            stru= arrlist.get(g);
            for(int r = 1; r <arrlist.size(); r++){
                if(stru.compareTo(arrlist.get(r))>0)
                    stru = arrlist.get(r);
            }
            omega.add(stru);
            arrlist.remove(stru);
        }
        omega.add(arrlist.get(0));
        System.out.printf("Shake Spare's play: %d words\nShake Spare's vocabs: %d words\n", add, y);
        for(int p = 0; p<omega.size(); p++)
            System.out.println("\t"+omega.get(p));
    }
}