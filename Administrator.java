
public class Administrator
{
   /**
    * Administrator constructor
    * @param the id number
    * @param the first name
    * @param the last name
    */
    public Administrator(String id, String fname, String lname)
   {
       this.id = id;
       this.fname = fname;
       this.lname = lname;
    }
   /**
    * getId returns id number
    * @return the id number
    */
    public String getID(){
        return id;  
    }
    /**
    * getfname returns first name 
    * @return the first name  
    */
    public String getfname(){
       return fname;  
    }
    /**
    * getlname returns last name 
    * @return the last name  
    */
    public String getlname(){
       return lname; 
    }
    public double getSalary()
    {
        return salary;
    }
      private String id;
      private String fname;
      private String lname;
      private double salary;
}
