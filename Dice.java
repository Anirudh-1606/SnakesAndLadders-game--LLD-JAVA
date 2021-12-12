import java.util.*;
import java.lang.*;

public class Dice {

    // intializing number of dice

    private int noOfDice;

    Dice(int noOfDice) {
        this.noOfDice = noOfDice;
    }

    // method to get a random dice number based on number of dice

    public int rollDice() {
        return ((int) (Math.random() * (6 * noOfDice - 1 * noOfDice))) + 1;

    }
}