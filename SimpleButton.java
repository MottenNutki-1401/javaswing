import javax.swing.*; //this imports all classes from the swing package cuz we're lazy :D
public class SimpleButton {

    public static void main (String [] args) {
        //of course we need a window (JFrame) so our button can have a house??

        JFrame window = new JFrame ("Simple Button Demo"); // yeah we can dorectly put a title here or we can also followthe method we did on "CustomJframe.java"

        JButton button1 = new JButton ("Click here"); // this is our button object


        window.setSize(400,600); //width, height in pixels
        window.setDefaultCloseOperation(0); //this type of exit won't close the window when we click the "X" button hehe 

        //visibilty logic
        window.add(button1); // we need toadd button in the window so it shows up
        window.setVisible(true);
    }
    
}
//Extra note for DefaultCloseOperation values:
// 0 - DO_NOTHING_ON_CLOSE - this is why the code above wont close 
// 1 - HIDE_ON_CLOSE    
// 2 - DISPOSE_ON_CLOSE
// 3 - EXIT_ON_CLOSE 

//these are constant values/ constants = A value that is fixed and is not supposed to change while the program is running :)