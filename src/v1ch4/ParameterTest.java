package v1ch4;


/***
 * This program demonstrates how java deliver parameters.
 * @version 0.1 2022-07-11
 * @author Shisen Wang
 */
public class ParameterTest
{
    public static void main (String[] args)
    {
        var paraTest = new ParameterTest();


        //basic parameter passing/transmission
        int i = 3;
        paraTest.basicTypePara(i);
        System.out.println("i's value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + i);


        //reference parameter passing/transmission
        StringBuilder stringBuilder = new StringBuilder("1");
        paraTest.referencePara(stringBuilder);
        System.out.println("stringBuilder's value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + stringBuilder.toString());


        //two reference objects passing/transmission
        StringBuilder sbOne = new StringBuilder("sbOne");
        StringBuilder sbTwo = new StringBuilder("sbTwo");
        paraTest.referenceParaSwap(sbOne, sbTwo);
        System.out.println("sbOne value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + sbOne.toString());

        System.out.println("sbTwo value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + sbTwo.toString());

    }


    /**
     * Basic data type's variable as parameter
     */
    public void basicTypePara (int i)
    {
        //to do
        i *= 2;
        System.out.println("i's value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + i);
    }

    /**
     * Reference variable as parameter
     */
    public void referencePara (StringBuilder stringBuilder)
    {
        //to do
        //change stringBuilder object value from "1" to "2"
        stringBuilder.replace(0, 1, "2");
        System.out.println("stringBuilder's value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + stringBuilder.toString());
    }

    /**
     * Prove java uses "call by value" method when you pass reference object as formal parameter.
     */
    public void referenceParaSwap (StringBuilder sbOne, StringBuilder sbTwo)
    {
        //to do
        //swap StringBuilderOne and StringBuilderTwo
        var temp = sbOne;
        sbOne = sbTwo;
        sbTwo = temp;
        System.out.println("sbOne value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + sbOne.toString());

        System.out.println("sbTwo value in " + new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName() + " function: " + sbTwo.toString());

    }

}
