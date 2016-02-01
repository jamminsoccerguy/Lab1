package step1;

/**
 * Created by Pluck on 1/26/2016.
 */

/**
 * Lab 1 Part 1
 */


public class Puppy {

    public String name;
    public int weight;
    boolean hasSword;
    boolean isKnight;

    public Puppy(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.hasSword = false;
        this.isKnight = false;
    }

    public void makeKnight() {
        this.hasSword = true;
        this.isKnight = true;
    }
}