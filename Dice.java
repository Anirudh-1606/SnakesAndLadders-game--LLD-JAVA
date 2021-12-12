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

class SingleLogicDice extends Dice {
    private int noOfDice = 1;

    SingleLogicDice() {
        super(1);
    }

    // public int rollDice() {
    // int ran = ((int) (Math.random() * (6 - 1))) + 1;
    // if (ran == 6) {
    // ran = 6 + rollDice();
    // if (ran % 18 == 0) {
    // ran = 0;
    // return ran;
    // }
    // }
    // return ran;
    // }

    // 3 6's LOGIC

    public int rollDice() {
        int ran = ((int) (Math.random() * (6 - 1))) + 1;

        if (ran == 6) {
            while (true) {
                ran = 6 + ((int) (Math.random() * (6 - 1))) + 1;
                if (ran == 12) {
                    ran = 12 + ((int) (Math.random() * (6 - 1))) + 1;
                    if (ran == 18) {
                        System.out.println("3 6's in row. Hard Luck!");
                        ran = 0;
                        break;
                    } else {
                        break;
                    }

                } else {
                    break;
                }
            }
        }
        return ran;
    }

}
