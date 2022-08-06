package v1ch5.resource;


import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @version 0.1 2022-08-05
 * @author Shisen Wang
 */
public class ResourceTest
{
    public static void main(String[] args) throws IOException {
        Class cl = ResourceTest.class;
        URL aboutURL = cl.getResource("about.gif");
        var icon = new ImageIcon(aboutURL);

        InputStream inputStream = cl.getResourceAsStream("data/about.txt");
        var about = new String(inputStream.readAllBytes(), "UTF-8");

        InputStream inputStream2 = cl.getResourceAsStream("/corejava/title.txt");
        var title = new String(inputStream2.readAllBytes(), StandardCharsets.UTF_8).trim();

        JOptionPane.showMessageDialog(null, about, title, JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
