import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
/**
 * Write a description of class Tester2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester2
{
   public static void main(String[] args) throws IOException
   {
    Scanner in = new Scanner(System.in);
    FileReader reader = new FileReader("Employees.txt");
    FileReader reader2 = new FileReader("temp.txt");
    FileWriter writer2 = new FileWriter("temp.txt");
    writer2.write(reader.read());
    FileWriter writer = new FileWriter("Employees.txt");
    
    
    System.out.println("Enter your admin or employee password");
    String password = in.nextLine();
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Double> list2 = new ArrayList<Double>();
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
            String item = fname + " " + lname + ", " + id; 
            list.add(item);
            System.out.println(list);
            String fulldescrip = fname + " " + lname + ", " + id + ", ";
            String textOut = fname + " " + lname + ", " + id + ", " + hourlypay;
            list2.add(hourlypay);
            System.out.println(list2);
            String password2 = in.nextLine();
            writer.write(textOut + System.lineSeparator());
            System.out.println("Do you want to enter another employee? Say 'yes' or 'no'!");
            String response = in.nextLine();
            if (response.equals("no")){
                done = true;
                writer.write(reader2.read());
        }
      }
    }
    else if (password.substring(0,1).equalsIgnoreCase("E"))
    {
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String name = in2.nextLine();
        System.out.println("Enter your ID");
        String id2 = in2.nextLine();
        String message = name + ", " + id2;
        for(int i = 0; i<list.size(); i++){
            if(message.equals(list.get(i))){
                System.out.println("Success.");
            }
        }
    }
    else 
    {
        System.out.println("Invalid Password!");
    }
    writer.close();
    writer2.close();
    reader.close();
    reader2.close();
   }
}
