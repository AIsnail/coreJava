package v1ch3;

/***
 * This program shows how to store tabular data in a 2D array.
 * @version 0.1 2022-06-30
 * @author wang
 */
public class CompoundInterest
{
    public static void main (String[] args)
    {
        final double StartRate = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        //set interest rate to 10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
        {
            interestRate[j] = (StartRate + j) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];

        //set initial balances to 10000
        for (int j = 0; j < balances[0].length; j++)
        {
            balances[0][j] = 10000;
        }

        //compute interest for future years
        for (int i = 0; i < balances.length; i++)
        {
            for(int j = 0; j < balances[i].length; j++)
            {
                //get last year's balances from previous row
                double previousYearBalance = balances[i-1][j];

                //compute interest
                double currentInterest = previousYearBalance * interestRate[j];

                //compute this year's balances
                balances[i][j] = previousYearBalance + currentInterest;
            }
        }

        //print one row interest rates
        for (int j = 0; j < interestRate.length; j++)
        {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();

        //print balances table
        for (double[] row : balances)
        {
            for (double b : row)
            {
                System.out.printf("%10.0f", b);
            }
            System.out.println();
        }
    }
}
