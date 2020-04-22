public class Hailstone {

    /** Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        int length= 0;
        while(n!=1){
            if(n%2 !=0)
                n=3*n+1;
            else if(n%2==0)
                n=n/2;
            length++;
        }
        return length+1;
        /* to be implemented in part (a) */

    }


    /** Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        boolean x= false;
        int length= hailstoneLength(n);
        if(n<length) {
            x = true;
        }
        return x;
        /* to be implemented in part (b) */

    }


    /** Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
        int Lnum= 0;
        for(int i=1; i<=n; i++){
            if(isLongSeq(i)== true){
                Lnum++;
            }
        }
        double x= Lnum/n;
        return x;

    }

    // There may be instance variables, constructors, and methods not shown.
}
