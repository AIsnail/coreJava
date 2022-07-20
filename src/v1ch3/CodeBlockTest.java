package v1ch3;


/***
 * This program test the block in and out invoke.
 * @version 0.1 2020-06-23
 * @author wang
 */
public class CodeBlockTest
{
    public static void main(String[] args)
    {
        int out = 1;
        {
            int in = 2;
            //can find variable out
            System.out.printf("out:%d", out);
        }
        //can't find variable in
        //System.out.printf("in:%d", in);
    }
}
