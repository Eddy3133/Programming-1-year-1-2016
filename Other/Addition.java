import java.util.Scanner;
public class Addition
{
    public static void main ( String [] args )
    {
        System.out.println("please enter your BD in this format; yyyy mm dd");
        Scanner kb = new Scanner(System.in);
        int mm, dd, yy;
        mm = kb.nextInt();
        dd = kb.nextInt();
        yy = kb.nextInt();
        String yyy;
        switch(mm){
            case 1 : yyy = "January";
            break;

            case 2 : yyy = "Febuary";
            break;

            case 3 : yyy = "march";
            break;

            case 4 : yyy = "April";
            break;

            case 5 : yyy = "May";
            break;

            case 6 : yyy = "June";

            default : yyy = "none";
        }
        System.out.println(yyy +" "+ dd + "," + mm);
    }
}