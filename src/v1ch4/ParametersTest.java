package v1ch4;

/***
 * THis programs demonstrates how the java delivers parameters to method.
 * @version 0.1 2022-07-10
 * @author wang
 */
public class ParametersTest {
    public static void main (String[] args)
    {

    }

    /**
     * deliver basic data type parameter,
     * the modification of formal parameter will not change original variable.
     * @param a
     */
    private void basicTypeParameterTest (int i)
    {
        i++;
        System.out.println("i:" + i);
    }

    // deliver reference type parameter,
    // the modification of formal parameter will  change original variable.
    private void referenceTypeParameterTest (String s)
    {
        return;
    }

    // Java design the delivery of reference parameter by calling by value.
    // the Example proves it.

}
