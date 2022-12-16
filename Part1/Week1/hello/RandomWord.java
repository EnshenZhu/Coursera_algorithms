/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        int factor = 1;
        String champion = "power";

        while (StdIn.isEmpty() == false) {

            String theString = StdIn.readString();
            
            if (StdRandom.bernoulli(1 / factor) == true) {
                champion = theString;
                factor += 1;
            }

            factor += 1;
        }

        System.out.println(factor);

    }
}
