package v1ch6.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


/**
 * This program demonstrates anonymous inner class.
 * @version 0.1 2022-08-15
 * @author AIsnail
 */
public class AnonymousInnerClassTest
{
    public static void main(String[] args)
    {
        var clock = new TalkingClock();
        clock.start(1000, true);

        // keep program running until the user select "OK"
        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock
{
    /**
     * Starts the clock
     * @param interval  the interval between messages (in milliseconds)
     * @param beep      true if the clock should beep
     */
    public void start(int interval, boolean beep)
    {
        var listener = new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("At the tone, the time is"
                            + Instant.ofEpochMilli(e.getWhen()));
                    if (beep) Toolkit.getDefaultToolkit().beep();

                }
            };

        var timer = new Timer(interval, listener);
        timer.start();
    }
}