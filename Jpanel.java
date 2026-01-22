import javax.swing.*; //importing all classes from the swing package  
import java.awt.Color;  
public class Jpanel {

    public static void main (String [] args){

        JFrame panelFrame = new JFrame("This is a window with a JPanel");
        

        JPanel panel = new JPanel(); //creating a JPanel object
        panel.setBackground(Color.decode("#af6868"));
        panelFrame.setSize(500,500);
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //putting panel inside the frame
        panelFrame.add(panel);

        //makung the frame visible
        panelFrame.setVisible(true);


    }
    
}
