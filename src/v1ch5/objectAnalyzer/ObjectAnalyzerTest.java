package v1ch5.objectAnalyzer;

import java.util.ArrayList;

public class ObjectAnalyzerTest
{
    public static void main(String[] args) throws IllegalAccessException
    {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i < 5; i++)
            squares.add(i * 1);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
