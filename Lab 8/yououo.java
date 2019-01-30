import java.util.*;
import java.io.*;
/**Edirin Okpikpi
 * 3078829
 * lab8 q1
 */

      public class yououo{
          
          public static void main (String[]args)throws FileNotFoundException{
              ArrayList<String> given = new ArrayList<>();
              ArrayList<String> student = new ArrayList<>();
              System.out.println("Enter your given:");
              Scanner kb = new Scanner(System.in);
              Scanner extend = new Scanner (new File("readme.txt"));
              
              
              while(extend.hasNext()){
                  String outpput = extend.nextLine();
                  given.add(outpput);
                }
              
              while(kb.hasNext()){
                  student.clear();
                  for(int i=0; i<given.size(); i++){
                      String ans = kb.nextLine();
                      student.add(ans);
                    }
                    System.out.println(goal(given, student));
                }
            }
            
            public static int goal (ArrayList<String> g, ArrayList<String> s){
            int goal = 0;
            for(int i = 0; i<s.size(); i++){
                String currentAnswer = g.get(i);
                String currentStudent = s.get(i);
                boolean ifEqual =currentAnswer.equalsIgnoreCase(currentStudent);
                if (ifEqual){
                    goal++;
                    
                }
            }
            return goal;
        }
        
    }