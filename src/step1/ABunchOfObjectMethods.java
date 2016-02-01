package step1;

import java.util.List;

/**
 * Created by Pluck on 1/26/2016.
 */

/**
 * Lab 1 Part 1
 */


public class ABunchOfObjectMethods {

    /*
 * There seems to be a keyword missing...
 */
    public Puppy getPuppy(String name, int weight) {

        return new Puppy(name, weight);
    }

    /*
     * This method can be fixed by adding one thing.
     * After it's fixed, there seems to be an arithmetic error.
     */
    public int getTotalWeight(Puppy[] bulkGoods) {
        int result = 0;

        for (int i = 0; i < bulkGoods.length; i++){
            result += bulkGoods[i].weight;
        }

        return Math.abs(result);
    }

    /*
     * This method is missing the
     */
    public void feedPuppy(Puppy aPuppy, int weightOfFood){
        aPuppy.weight += weightOfFood;
    }

    public void knightPuppy(Puppy aPuppy) {
        aPuppy.makeKnight();
    }
}
