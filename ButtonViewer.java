import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * Write a description of class ButtonViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonViewer 
{
   public static void main (String[] args){
      JFrame frame = new JFrame();
   JButton button = new JButton("Click me!");
   frame.add(button);

   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);
}
private static final int FRAME_WIDTH = 100;
private static final int FRAME_HEIGHT = 60;
   
}
