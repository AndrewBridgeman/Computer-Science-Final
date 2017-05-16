import java.util.Scanner;

/**
 * Time measures elapsed time
 * 
 * Andrew Bridgeman
 */
public class Time
{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        boolean done = false;
        System.out.print("Enter 'start' to begin time: ");
        String word = in.nextLine();
        while(!done){
            if(word.equalsIgnoreCase("start")){
                long startTime = System.nanoTime();
                System.out.print("Enter 'stop' to end time: ");
                String word2 = in.nextLine();
                if(word2.equalsIgnoreCase("stop")){
                    long endTime = System.nanoTime();
                    long estimatedTime = System.nanoTime() - startTime;
                    System.out.print("Time difference: ");
                    System.out.print(estimatedTime/1000000000);
                    if(estimatedTime/1000000000 !=1){
                        System.out.print(" seconds");
                    }
                    else{
                        System.out.print(" second");
                    }
                    done = true;
                }
                else{
                    System.out.println("Invalid statement");
                    done = true;
                }
            }
            else{
                System.out.println("Invalid statement");
                done = true;
            }
        }
    }
}