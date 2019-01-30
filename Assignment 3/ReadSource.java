import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
public class ReadSource {
   
    
    public static void main (String [] args) throws IOException {
       Scanner s1 = new Scanner (new File ("Readme.txt"));
       s1.next();
       while (s1.hasNext()){
      Student s = makeStudent(s1.next());
      System.out.println(s);
    }
    
}
public static Student makeStudent (String line) {
    line = line.replace(","," ");
    Scanner s = new Scanner (line);
    String fn = s.next();
    String ln = s.next();
    char g = s.next().charAt(0);
    return new Student( fn, ln, g, true);
}
}