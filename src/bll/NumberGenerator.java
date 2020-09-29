package bll;

import java.util.Random;

public class NumberGenerator implements IGenerator {


    @Override
    public long generator(int high, int low) {
        Random rand = new Random();

        int randomNumber;
        int newHigh;

        if (high < low){
            newHigh = high*low;
        }else {
            newHigh = high;
        }

        randomNumber = rand.nextInt(newHigh-low) + 1;

        return randomNumber;
    }
}
