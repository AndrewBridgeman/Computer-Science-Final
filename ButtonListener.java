import java.io.*;
import javax.swing.*;
import java.awt.event.*; 
 public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) { 
    JFrame frame = new JFrame();
    JButton button = new JButton("Click for Admin");
    frame.add(button);        
            
    System.out.println("Stuff");
        
    
    ActionListener listener = new ButtonListener();
    button.addActionListener(listener);
    
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
   private static final int FRAME_WIDTH = 120;
   private static final int FRAME_HEIGHT = 80;
}
    