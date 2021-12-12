import java.util.*;

public class Board {
    private Dice dice;
    private Queue<Player> playerTurns;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer, Ladders> ladders;
    private int boardSize;

    Board(int boardSize, Dice dice, HashMap<Integer, Snakes> snakes, HashMap<Integer, Ladders> ladders,
            Queue<Player> playerTurns) {
        this.boardSize = boardSize;
        this.dice = dice;
        this.snakes = snakes;
        this.ladders = ladders;
        this.playerTurns = playerTurns;

    }

    public void startGame() {
        while (true) {
            Player p = playerTurns.poll();
            int currLoc = p.getLocation();
            int nextLoc = currLoc + dice.rollDice();
            if (nextLoc <= boardSize) {
                if (snakes.containsKey(nextLoc)) {
                    System.out.println(p.getName() + " was bitten by a snake!");
                    Snakes obj = snakes.get(nextLoc);
                    nextLoc = obj.getEndPoint();
                } else if (ladders.containsKey(nextLoc)) {
                    System.out.println(p.getName() + " climbed a Ladder!");
                    Ladders obj = ladders.get(nextLoc);
                    nextLoc = obj.getEndPoint();
                }
                currLoc = nextLoc;
                System.out.println(p.getName() + " moved to " + currLoc);
                if (currLoc == boardSize) {
                    System.out.println();
                    System.out.println(p.getName() + " won th Game!!");
                    break;
                }
                p.setLocation(currLoc);

            }
            playerTurns.add(p);

        }
    }

}
