package v1ch6.staticInnerClass;

public class StaticInnerClassTest
{
    public static void main(String[] args)
    {
        var values = new double[20];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = 100 * Math.random();
        }
        ArrayAlg.Pair p = ArrayAlg.minMax(values);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());
    }
}

class ArrayAlg
{

    /**
     * A pair of floating-point numbers
     */
    public static class Pair
    {
        private double first;
        private double second;

        /**
         * Constructs a pair from two floating-point numbers
         * @param first
         * @param second
         */
        public Pair(double first, double second)
        {
            this.first = first;
            this.second = second;
        }

        /**
         * Return the first number of the pair
         * @return  the first number
         */
        public double getFirst()
        {
            return first;
        }

        /**
         * Return the second number of the pair
         * @return  the second number
         */
        public double getSecond()
        {
            return second;
        }
    }

    /**
     * Computes both the minimum and maximum of an array
     * @param values    an array of floating-point numbers
     * @return          a pair whose first element is the minimum and whose second element
     * is the maximum
     */
    public static Pair minMax(double[] values)
    {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double v : values)
        {
            if (max < v) max = v;
            if (min > v) min = v;
        }
        return new Pair(min, max);
    }
}
