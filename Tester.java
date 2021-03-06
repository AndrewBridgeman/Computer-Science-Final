import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Tester allows administrators and employees to enter into a system
 * 
 * Andrew Bridgeman, Austin Rader, Jaskirat Singh
 */

public class Tester
{
   public static void main(String[] args) throws IOException
   {
    Scanner in = new Scanner(System.in);
    File employeeInfo = new File("Employees.txt");
    File employeeSalaries = new File("Salaries.txt");
    File employeePayday = new File("Payday.txt");

    FileWriter writer = new FileWriter(employeeInfo, true);
    FileReader reader = new FileReader(employeeInfo);
    
    FileWriter writer2 = new FileWriter(employeeSalaries, true);
    FileReader reader2 = new FileReader(employeeSalaries);
    
    FileWriter writer3 = new FileWriter(employeePayday, true);
    FileReader reader3 = new FileReader(employeePayday);
    
    Scanner fileIn = new Scanner(reader);
    Scanner fileIn2 = new Scanner(reader2);
    Scanner fileIn3 = new Scanner(reader3);
    
    System.out.println("Enter your admin or employee password");
    String password = in.nextLine();
    ArrayList<String> employees = new ArrayList<String>();
    ArrayList<Double> salaries = new ArrayList<Double>();
    
    if (password.substring(0,1).equalsIgnoreCase("A"))
    {
      boolean done = false;
      System.out.println("Would you like to add an employee or view the payroll?");
      String choice = in.nextLine();
      if (choice.equalsIgnoreCase("add an employee"))
      {
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
            Employee employee = new Employee(fname, lname, id, hourlypay);
            employees.add(employee.toString());
            System.out.println(employee.toString());
           
            String employeeInfoOut = fname + " " + lname + ", " + id;
            String employeeSalariesOut = fname + " " + lname + ", " + hourlypay;
            writer.write(employeeInfoOut + System.lineSeparator());
            writer2.write(employeeSalariesOut + System.lineSeparator());
            
            salaries.add(hourlypay);
            String formatting = in.nextLine();
            System.out.println("Do you want to enter another employee? Say 'yes' or 'no'!");
            String response = in.nextLine();
            if (response.equals("no"))
            {
                done = true;
            }
            if(!(response.equals("yes")) && !(response.equals("no"))){
                System.out.println("Invalid command");
                done = true;
            }
        }
      }
      else if (choice.equalsIgnoreCase("view the payroll"))
      {
          System.out.println("Enter the first name of the employee");
          String firstName = in.nextLine();
          System.out.println("Enter the last name of the employee");
          String lastName = in.nextLine();
          double employeeSalary = 0;
          while(fileIn3.hasNextLine()&&(!done))
          {
              String temp = fileIn3.nextLine();
              if (temp.contains(firstName + " " + lastName))
              {
                  employeeSalary = employeeSalary + Double.parseDouble(temp.substring((firstName + " " + lastName).length() + 2));
              }
          }
          if(employeeSalary==0){
              System.out.println("This employee has either not been entered into the system or did not work this week.");
          }
          else{
            System.out.println(firstName + " " + lastName + " earned $" + employeeSalary + ".");
          }
      }
      else{
          System.out.println("Invalid command.");
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
        String fullName = firstName + " " + lastName;
        String message = fullName + ", " + employID;
        boolean realEmployee = false;
        boolean done = false;
        while (fileIn.hasNextLine() == true && realEmployee == false)
        {
            Time hoursWorked = new Time();
            if(message.equalsIgnoreCase(fileIn.nextLine()))
            {
                hoursWorked.startTime();
                System.out.println("Hello " + fullName + ", you are clocked in.");
                realEmployee = true;
                System.out.println();
            }
            if (realEmployee == true)
            {
                while (fileIn2.hasNextLine())
                {
                    String temp = fileIn2.nextLine();
                    if (temp.contains(fullName))
                    {
                        String mySalary = temp.substring(fullName.length()+1);
                        System.out.println("Type 'out' when you want to clock out.");
                        while(!done){
                            String word = in.next();
                            if(hoursWorked.getCurrentTime()/60>8 || word.equals("out")){
                                hoursWorked.endTime();
                                double totalTime = hoursWorked.getTime()/60;
                                System.out.println("You worked for " + totalTime + " hours.");
                                double totalPay = totalTime * Double.parseDouble(mySalary);
                                System.out.println("You earned $" + totalPay + ".");
                                writer3.write(fullName + ", " + totalPay + System.lineSeparator());
                                done = true;
                            }
                            else if(!(word.equals("out"))){
                                System.out.println("You did not enter 'out'!");
                                done = true;
                            }
                        }   
                    }
                }
            }
        }
        if(done==false){
            System.out.println("You have not been entered into the system.");
        }
    }
    
    else{
        System.out.println("Invalid password!");
    }
    in.close();
    writer.close();
    reader.close();
    writer2.close();
    reader2.close();
    writer3.close();
    reader3.close();
  }
}