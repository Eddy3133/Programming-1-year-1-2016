
/**
 *EDIRIN OKPIKPI
 *3078829
 *LAB8 Q2
 */
public class Driver
{
    public static void main (String[] args)
    {
        // create author objects

        // this is just sample data for demonstration purposes
        Author godfrey = new Author("Jimmy", "Chan");
        Author tony1 = new Author("Connor","Smith");
        Author tony2 = new Author("Tim","Connor");

        // create a publisher and give it some authors
        Publisher pub = new Publisher("Duckworth Publishers");
        pub.setCity("Winnipeg");
        pub.setPostalCode("R3B 2E9");
        pub.addAuthor(godfrey);
        pub.addAuthor(tony1);
        pub.addAuthor(tony2);

        /**
         * This code segment uses the find method of Publisher to determine
         * which authors have a first name "Connor" or a last name "Connor".
         */ 
        String aName = "Connor";
        System.out.println("Authors whose first or last name is "
            +aName+" are:\n"+pub.find(aName));
    }

}
