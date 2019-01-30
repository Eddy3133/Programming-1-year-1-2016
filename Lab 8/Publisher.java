/**
 * EDIRIN OKPIKPI
 * 3078829
 * LAB8 Q2
 */
import java.util.ArrayList;
public class Publisher {  
    private String name, city, postalCode;
    private ArrayList<Author> authors;

    public Publisher(String n)    {
        name = n;
        authors = new ArrayList<Author>();
    }

    public String getCity(){
        return city;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCity(String name){
        this.city = name;
    }

    public void setPostalCode(String pc){
        this.postalCode = pc;
    }

    public void setname(String name){
        this.name = name;
    }

    public void addAuthor(Author a)    {
        authors.add(a);
    }

    public ArrayList<Author> getAuthors(){
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors){
        this.authors =  authors;
    }

    public String find (String searchName) {
        String result="";

        for(Author a: authors){
            if(a.getFirstName().equals(searchName) 
            || a.getLastName().equals(searchName)){
                result += a.getFirstName() + " " + a.getLastName() +"\n";

            }

        }
        return result;
    }
}
