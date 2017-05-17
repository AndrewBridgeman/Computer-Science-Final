/**
 * Write a description of class Time2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time2
{
    public Time2(){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void startTime(){
        startTime = System.nanoTime();
    }
    public void endTime(){
        endTime = System.nanoTime();
    }
    public double getTime(){
        return (endTime-startTime)/1000000000;
    }
    private long startTime;
    private long endTime;
}
