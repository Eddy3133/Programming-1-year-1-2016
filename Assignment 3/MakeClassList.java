import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
public class MakeClassList {

    public static void main (String [] args) throws IOException {
        Scanner s1 = new Scanner (new File ("Readme.txt"));
        s1.next();
        ArrayList<Student> classlist = new ArrayList<>();
        while (s1.hasNext()){
            Student s = makeStudent(s1.next());

            classlist.add(s);
        }
        System.out.println(classlist);
    }

    public static Student Students(String line) {
        line = line.replace(","," ");
        Scanner s = new Scanner (line);
        String fn = s.next();
        String ln = s.next();
        char g = s.next().charAt(0);
        Student s3 = new Student( fn, ln, g, true);
        return s3;
    }
    
    public static Student makeStudent (String line) throws IOException
    {
        Scanner theLine = new Scanner(line);
        String fn = theLine.next() ;
        String ln = theLine.next();
        char g = theLine.next().charAt(0); 
        Student s = new Student(fn, ln, g, true);
        return s;
    }
}