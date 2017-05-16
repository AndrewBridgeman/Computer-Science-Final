
/**
 * An employee class that represents an employee with a given first name, last name, and id number.
 */
public class Employee implements User
{
    /**
     * Constructs a new Employee object with a given first name, last name, and id number.
     * @param fname = the first name of the employee
     * @param lname = the last name of the employee
     * @param idNum = the id number of the employee
     */
    public Employee(String fname, String lname, String idNum)
    {
        fName = fname;
        lName = lname;
        id = idNum;
    }
    /**
     * Returns the first name of the employee
     * @return fName = the first name of the employee
     */
    public String getFirstName()
    {
        return fName;
    }
    /**
     * Returns the last name of the employee
     * @return lName = the last name of the employee
     */
    public String getLastName()
    {
        return lName;
    }
    /**
     * Returns the id number of the employee
     * @return id = the id number of the employee
     */
    public String getID()
    {
        return id;
    }
    private String id;
    private String fName;
    private String lName;
}