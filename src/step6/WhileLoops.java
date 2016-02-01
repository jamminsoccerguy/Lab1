package step6;

/**
 * Created by Pluck on 1/26/2016.
 */

public class WhileLoops {

    public static void main (String[] args){

        WhileLoops loops = new WhileLoops();

        int count = 1;
        while(count <= 100) {
            System.out.println("Count is: " + count);
            count += 2;
        }

        System.out.println();

        int number = 500;
        while(number >= 5){
            System.out.println("Number is: " + number);
            number -= 5;
        }

        System.out.println();

        loops.sumAndAverage(1, 100);
    }

    public void sumAndAverage(double min, double max){
        double sum = 0;
        double average;

        double count = min;
        while(count <= max){
            sum += count;
            count++;
        }

        average = sum / max;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
