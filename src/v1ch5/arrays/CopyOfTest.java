package v1ch5.arrays;


import java.lang.reflect.Array;

/**
 * This program demonstrates the use of reflection for manipulating arrays.
 *
 * @version 0.1 2022-08-07
 * @author Shisen Wang
 */
public class CopyOfTest
{
    public static void main(String[] args)
    {

    }


    public static Object[] badCopyOf(Object[] a, int newLength)
    {
        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }


    /**
     * This method grows an array by allocating a new array of the same type and
     * copying all elements.
     *
     * @param a the array to grow. This can be an object array or a primitive
     *          type array.
     * @param newLength the length of new array.
     * @return  a large array that contains all elements of a.
     */
    public static Object goodCopyOf(Object a, int newLength)
    {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
