package step3;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by Pluck on 1/26/2016.
 */

// Note: you may need to close this application by typing Control-C at the
// console.

public class MyFrame extends JFrame {

    Font f;
    boolean toggle;

    MyFrame(String label) {

        super(label);  // calls the constructor for Frame
        f = new Font ("SansSerif", Font.BOLD, 24);
        setBounds(0, 0, 450, 150);
    }

    public void paint(Graphics g) {
        g.setFont(f);
        toggle = !toggle;
        if (toggle)
            g.setColor(Color.blue);
        else g.setColor(Color.red);
        g.drawString("Here We Go!!!", 100, 100);

        g.drawLine(200, 10, 150, 70);
        g.drawRect(10, 60, 35, 35);
        g.drawOval(60, 60, 20, 20);
        g.drawString("Hello...It's me", 50, 130);

        Math.abs(0);
    }

    public static void main(String[] args) {

        // create an instance of a Frame
        MyFrame myFrame = new MyFrame("You've been framed!");
        myFrame.setVisible(true);  // needed for Frames, auto for applets
    }

} // class FirstFrame
