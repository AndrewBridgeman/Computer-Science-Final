import java.util.ArrayList;

/**
 * PersonArray superclass that creates an array of employees
 * 
 * Andrew Bridgeman
 */
public class PersonArrayList
{
    /**
     * PersonArrayList constructor
     */
    public PersonArrayList(){
        ArrayList<String> list = new ArrayList<String>();
    }
    /**
     * getArray returns list
     * @return list the array of employees
     */
    public ArrayList<String> getArray(){
        return list;
    }
    private ArrayList<String> list;
}
