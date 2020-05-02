public class Combinatorics {

    /** Precondition: n is between 1 and 12, inclusive.
     * Returns the factorial of n, as described in part (a). */
    public static int factorial(int n)
    { /* to be implemented in part (a) */
        int fac= 0;
        if(n==1)
            fac=1;
        else
            fac= n*factorial(n-1);
        return fac;

    }


    /** Precondition: n and r are between 1 and 12, inclusive. * Determines the number of ways r items can be selected
     * from n choices and prints the result, as described in part
     (b). */
    public static void numCombinations(int n, int r)
    { /* to be implemented in part (b) */
        int comb=0;
        if(r>n)
            comb=0;
        else
            comb= (factorial(n)/(factorial(r))*(factorial(n)-factorial(r)));

    }
}
