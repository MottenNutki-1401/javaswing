import javax.swing.JFrame; // a built-in class we should import
public class Jframe {

    public static void main (String[] args) {

        //There are may ways we can create a JFrame, this is called
        //"Constructors" -> ways to create an object of a class like this JFrame

        JFrame frame = new JFrame (); // this is a default constructor
        //when we run this code we can't see a tittle in our JFRme

        // Now we're going to add methods of java JFrame 
        // methods -> in java these are block of codes used toperform a specific action when called
        //Basically methods are like tools we can use to modify or change the object we created
        // In this case the object we created is "frame"
        
        frame.setSize (400,300); // this method sets the size of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
        

    }
    
}
