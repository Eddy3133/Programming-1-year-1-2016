/**
 * EDIRIN OKPIKPI
 * 3078829
 * LAB8 Q2
 */
public class Author
{
    private String firstName;
    private String lastName;

    //  the constuctor 
    public Author( String f, String l ) {
        firstName = f;
        lastName  = l;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
// the getters and setters for Author
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

}

