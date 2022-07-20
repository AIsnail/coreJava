package v1ch3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/***
 * This program is used to write to file.
 * @version 0.1 2022-06-21
 * @author wang
 */
public class WritingFile
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter("../resources/v1ch3text.txt", StandardCharsets.UTF_8);
        String str = "This is a test sentence.";
        out.append(str);
        out.close();
    }
}
