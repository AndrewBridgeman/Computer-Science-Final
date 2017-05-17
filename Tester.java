import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class Tester2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
   public static void main(String[] args) throws IOException
   {
    Scanner in = new Scanner(System.in);
    File employeeInfo = new File("Employees.txt");
    File employeeSalary = new File("Salries.txt");
    FileReader reader = new FileReader(employeeInfo);
    FileWriter writer = new FileWriter(employeeInfo, true);
    FileReader reader2 = new FileReader(employeeSalary);
    FileWriter writer2 = new FileWriter(employeeSalary, true);
    Scanner fileIn = new Scanner(reader);
    
    System.out.println("Enter your admin or employee password");
    String password = in.nextLine();
    ArrayList<String> employees = new ArrayList<String>();
    ArrayList<Double> salaries = new ArrayList<Double>();
    if (password.substring(0,1).equalsIgnoreCase("A"))
    {
      boolean done = false;
        while(!done)
        {
            System.out.println("Enter the first name of the new employee");
            String fname = in.nextLine();
            System.out.println("Enter the last name of the new employee");
            String lname = in.nextLine();
            System.out.println("Enter the ID name of the new employee");
            String id = in.nextLine(); 
            System.out.println("Enter the hourly pay of the new employee");
            double hourlypay = in.nextDouble();
            String newEmployee = fname + " " + lname + ", " + id; 
            employees.add(newEmployee);
            System.out.println(employees);
            String fulldescrip = fname + " " + lname + ", " + id + ", ";
            String textOut = fname + " " + lname + ", " + id + ", " + hourlypay;
            salaries.add(hourlypay);
            System.out.println(salaries);
            String formatti = in.nextLine();
            writer.write(textOut + System.lineSeparator());
            System.out.println("Do you want to enter another employee? Say 'yes' or 'no'!");
            String response = in.nextLine();
            if (response.equals("no")){
                done = true;
        }
      }
    }
    else if (password.substring(0,1).equalsIgnoreCase("E"))
    {
        System.out.println("Enter your first name");
        String firstName = in.nextLine();
        System.out.println("Enter your last name");
        String lastName = in.nextLine();
        System.out.println("Enter your ID");
        String employID = in.nextLine();
        System.out.println("Enter your salary");
        String employSal = in.nextLine();
        String message = firstName + " " + lastName + ", " + employID + ", " + employSal;
        while (fileIn.hasNextLine() == true)
        {
            if(message.equalsIgnoreCase(fileIn.nextLine()))
            {
                System.out.println("Success.");
            } 
        }
    }
    else 
    {
        System.out.println("Invalid Password!");
    }
    writer.close();
    reader.close();
   }
}
