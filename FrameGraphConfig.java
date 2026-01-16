import javax.swing.JFrame;
import java.awt.GraphicsConfiguration; //awt is abstarc window toolkit
import java.awt.GraphicsEnvironment;
import static javax.swing.JFrame.EXIT_ON_CLOSE; // we can also just use import javax.swing*; (this includes everything in swing package)
public class FrameGraphConfig {

    // when dealing with devices with multiplescreen/ monitors sometimes they are not configured the same
    // such as different resolutions or color depths, or hardware/os graphic rules
    // to fix that we can use GraphicsConfiguration class to create JFrame that is compatible with whatever the device screen is

    // for this we will start by writing a helper method that creates and returns a JFrame

    public static JFrame gcFrame () {

        // First: we get the graphics enviroment of the system 
        GraphicsEnvironment getGc = GraphicsEnvironment.getLocalGraphicsEnvironment();
        // Second: we get the default screen device from graphic environment
        GraphicsConfiguration defaultGc = getGc.getDefaultScreenDevice().getDefaultConfiguration();
        //Finally: we create the JFRame using the Graphic config we created above
        JFrame gcFrame = new JFrame (defaultGc);
        gcFrame.setTitle("This is a Graphic Config Window");
        gcFrame.setSize(500, 500); //in pixels
        gcFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gcFrame.setLocationRelativeTo(null); //center window on screen

        return gcFrame;

    }
    public static void main (String [] args) {
        JFrame TestWindow = gcFrame();
        TestWindow.setVisible(true);
    }

    
}
