import java.awt.*;
import java.awt.event.*;
import java.javax.swing.*;
/**
 * Created by William Paddock on 2/20/2016.
 */
public class GuiWindow {
    public static void main(String[] args)
    {
        JFrame win = new EgWindow(); //Create a window
        win.show(); //Display it
    }
    // //* This is the definition of the window, which extends JFrame
//* **************************************************
    class EgWindow extends JFrame
    {
        //
//* The constructor for EgWindow
//* ***************************
        public EgWindow()
        {
            setTitle("Example1");
            setSize(400,300);
//
//* An inner class is defined as the window Listener
//* It is only interested in the windowClosing event,
//* which will shut down the program
//* *****************************************
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                } // Terminate the program
            });
        }
    }
}
