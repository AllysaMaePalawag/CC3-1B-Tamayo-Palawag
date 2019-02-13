package rpgg;

import java.util.Random;

public class Dice {
    /* Model rolling a regular six sided die
     instance variables */ 
    
    private Random r;
        /** Instantiate the object r */
    
    public Dice() {
        r = new Random();
    }
    
    /*** Returns a random integer between 1 and 6 */
    public int roll() {
        int roll = r.nextInt(6)+1;
        return roll;
    }
    
}
