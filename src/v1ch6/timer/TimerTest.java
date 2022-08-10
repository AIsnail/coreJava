package v1ch6.timer;


import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

/**
 * @version 0.1 2022-08-10
 * @author Shisen Wang
 */
public class TimerTest
{
    public static void main(String[] args)
    {
        var listener = new TimePrinter();

        // constructor a timer that calls the listener
        // once every second
        var timer = new Timer(1000, listener);
        timer.start();

        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " +
                Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
