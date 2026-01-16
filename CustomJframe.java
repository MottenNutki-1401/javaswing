import javax.swing.JFrame;

public class CustomJframe {
    public static void main (String[] args) {

        JFrame customF = new JFrame ();

        // this is also one way to set name of JFrame From the previous file (Jframe.java) we directly name it using string JFrame constructor
        customF.setTitle("Preety Frame");
        // now we can set size here (when the app runs this will be the default size of the main frame/window)
        customF.setSize (600, 550); // these are set in pixels 
        // the behavior of JFrame by default when we click the close button is HIDE_ON_CLOSE
        // this means that even though the user press X button, the appliction will still be running in the background
        // thats why we will use the method (EXIT_ON_CLOSE) to terminate the program when user clicks the X button
        customF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //If we run this without making it visible we wont see anything on the screen
        //But this mean all the of the code we wrote above is nothing? It exist but we need to tell java to make it visible
        customF.setVisible(true); // the value of this method is in boolean 

    }
    
}
