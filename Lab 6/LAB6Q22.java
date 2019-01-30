 /**
 * EDIRIN OKPIKPI
 * 3078829
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LAB6Q22
{
    public static void main(String[] args)
    throws FileNotFoundException 
    {
        Scanner p = new Scanner(new File("ReadMe.txt"));

        int number  =  0;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;

        System.out.println(
            "<<<< File Readme.txt >>>>");
        while (p.hasNext()){
            String brace = p.next();
            for(int d = 0; d<brace.length(); d++){
                char alphabets = brace.charAt(d);
            switch(alphabets){
                case 'a': 
                number++;
                break;
                
                case 'e': 
                number1++;
                break;
                
                case 'i': 
                number2++;
                break;
                
                case 'o': 
                number3++;
                break;
                
                case 'u': 
                number4++;
                break;

            }

        }
       
    }
     System.out.println("a"+" "+number);
        System.out.println("e"+" "+number1);
        System.out.println("i"+" "+number2);
        System.out.println("0"+" "+number3);
        System.out.println("u"+" "+number4);
}
}