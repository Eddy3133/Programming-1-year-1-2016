import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class countWords{
    public static void main(String[] args)
    throws FileNotFoundException{
        AnalyseWords();
    }
    
    static void AnalyseWords() throws FileNotFoundException {
    
        String to = "to";
        String the = "the";
        String be = "be";

        int totalCount = 0;
        int toCount = 0;
        int theCount = 0;
        int beCount = 0;

        //creating File instance to reference text file in Java
        Scanner s = new Scanner(new File("readme.txt"));

        //Reading each line of file using Scanner class
        while (s.hasNext()) {
            totalCount++;
            //Reading each word in using the next method from the scanner class
            String word = s.next().toLowerCase();
            if (word.equals(to))
            toCount++;
            if (word.equals(the))
            theCount++;
            if (word.equals(be))
            beCount++;
        }
        System.out.println("Number of TO in text: "+ toCount + "\n" + "Number of THE in text: " + theCount + "\n" + "Number of BE in text: " + beCount);
    }
        
    }


//|| word.equals(the) || word.equals(be))