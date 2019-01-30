/**NAME: OKPIKPI EDIRIN
 * STUDENT NUMBER: 3078829
 * LAB7
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class vowels
{
    public static Scanner readme;
    public static int a,e,i,o,u;
   
    
    public static void main(String[] args)throws IOException  {
    
    setup();
    getFrequency();
    reportResults();
}
    
    
    public static void setup () throws IOException{
        readme = new Scanner(new File("Readme.txt"));
        a=0;
        e=0;
        i=0;
        o=0;
        u=0;
    }

    public static void getFrequency (){
        while (readme.hasNext()){
            String token = readme.next().toLowerCase();
            for (int o=0; o<token.length();o++){
                char p = token.charAt(o);
                switch (p){
                    case 'a': a++;
                    break;
                    case 'e': e++;
                    break;
                    case 'i': i++;
                    break;
                    case 'o': o++;
                    break;
                    case 'u': u++;
                    break;
                }
            }     
        }
    }

    public static void reportResults(){
        System.out.println("a "+ a);
        System.out.println("e "+ e);
        System.out.println("i "+ i);
        System.out.println("o "+ o);
        System.out.println("u "+ u);
    }
}
