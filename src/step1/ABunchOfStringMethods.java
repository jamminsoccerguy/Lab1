package step1;

/**
 * Created by Pluck on 1/26/2016.
 */

/**
 * Lab 1 Part 1
 */


public class ABunchOfStringMethods {

    public boolean isAPicture(String fileName) {
        return fileName.contains(".png");
    }

    /*
    * Write this one yourself, use name.equalsIgnoreCase() case so bob is valid as well as BoB
    */
    public boolean isBob(String name) {
        return name.equalsIgnoreCase("bob");
    }

    public String sayHelloTo(String name) {
        return "Hello, " + name;
    }

    public boolean shouldSkipLine(String string) {
        String trimmed = string.trim();

        return trimmed.charAt(0) == '#';
    }
}