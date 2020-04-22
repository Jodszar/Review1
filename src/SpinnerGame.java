public class SpinnerGame {
    /**
     * Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max) {
        int result = (int)(Math.random()*(max-min+1)+min);

        return result;
    }

    /**
     * Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int PS = spin(1, 10);
        int CS = spin(2, 8);
        if (CS > PS)
            System.out.println("You lose. " + (PS - CS) + " points");
        else if (PS > CS)
            System.out.println("You win! " + (PS - CS) + " points");

        else {
            int PS2 = spin(1, 10);
            int CS2 = spin(2, 8);
            if (PS + PS2 < CS + CS2)
                System.out.println("You lose. -1 point");
            else if (PS + PS2 > CS + CS2)
                System.out.println("You win! 1 point");
            else
                System.out.println("Tie. 0 points");
        }
    }
}
