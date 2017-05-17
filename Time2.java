/**
 * Time2 calculates elapsed time
 * 
 * Andrew Bridgeman, Austin Rader, Jaskirat Singh
 */
public class Time2
{
    /**
     * Time2 constructor
     */
    public Time2(){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    /**
     * startTime measures time at an instant
     */
    public void startTime(){
        startTime = System.nanoTime();
    }
    /**
     * endTime measure time at an instant
     */
    public void endTime(){
        endTime = System.nanoTime();
    }
    /**
     * getTime calculates elapsed time
     * @return the difference between startTime and endTime, converted to seconds
     */
    public double getTime(){
        return (endTime-startTime)/1000000000;
    }
    private long startTime;
    private long endTime;
}