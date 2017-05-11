import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
 public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your admin or employee password");
    String password = scanner.nextLine();
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<Double> list2 = new ArrayList<Double>();
    Scanner in = new Scanner(System.in);
    boolean done = false;
   while (!done){
        if(password.substring(0,1).equalsIgnoreCase("a")){
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
      String fulldescrip = fname + " " + lname + ", " + id + ", " ;
      list2.add(hourlypay);
      System.out.println(list2);
      String password2 = in.nextLine();
      System.out.println("Do you want to enter another employee? Say 'yes' or 'no'!");
      String response = in.nextLine();
      if (response.equals("no")){
          done = true;
        }
    } 
}
System.out.println("Login as an employee or an admin");
String password2 = in.nextLine();
    while(password2.substring(0,1).equalsIgnoreCase("b")){
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
}
}