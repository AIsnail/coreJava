package v1ch3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;

/**
 * This program is used to read files of txt.
 * @version 1.0
 * @author wang
 */
public class ReadingFile
{
    public static void main(String[] args) throws IOException {
        //reading content from destination file
        Scanner in = new Scanner(Path.of("../resources/v1ch3text.txt"), StandardCharsets.UTF_8);

        //output in console
        while(in.hasNext())
        {
            System.out.printf(in.nextLine());
        }
    }
}
