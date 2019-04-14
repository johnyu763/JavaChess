import javax.swing.*;
import java.awt.*;

class Chess{
    public static void main(String args[]){
       JFrame frame = new JFrame("Hello, World!");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(700,450);
       JButton button = new JButton("Start");
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
    }
}