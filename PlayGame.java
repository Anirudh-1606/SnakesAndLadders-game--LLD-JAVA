import java.util.*;

public class PlayGame {
    public static void main(String[] args) {

        // Scanner Class
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Snakes and Ladders Game!");

        // Board Size Input
        System.out.println("Enter Board Size");
        int bSize = in.nextInt();

        // NO of Dices
        System.out.println("Enter number of dices you want to play with:");
        int nDice = in.nextInt();

        // --Dice object
        // SingleDiceLogic object to be used to use a conditional dice.
        Dice dice = new Dice(nDice);

        // Snakes Input
        System.out.println("Enter No of Snakes");
        int nSnakes = in.nextInt();

        HashMap<Integer, Snakes> snakeMap = new HashMap<Integer, Snakes>();
        in.nextLine();
        while (nSnakes-- > 0) {
            String[] arr = in.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Snakes snake = new Snakes(st, en);
            snakeMap.put(st, snake);
        }

        // Ladders Input
        System.out.println("Enter No of Ladders");
        int nLadders = in.nextInt();

        HashMap<Integer, Ladders> ladderMap = new HashMap<Integer, Ladders>();
        in.nextLine();
        while (nLadders-- > 0) {
            String[] arr = in.nextLine().split(" ");
            int st = Integer.parseInt(arr[0]);
            int en = Integer.parseInt(arr[1]);
            Ladders ladder = new Ladders(st, en);
            ladderMap.put(st, ladder);
        }

        // Players input

        Queue<Player> playerTurns = new LinkedList<Player>();

        System.out.println("Enter number of players: ");
        int nPlayers = in.nextInt();
        in.nextLine();
        System.out.println("Enter Players Name");
        while (nPlayers-- > 0) {
            String name = in.nextLine();
            Player p = new Player(name);
            playerTurns.add(p);
        }

        Board gameBoard = new Board(bSize, dice, snakeMap, ladderMap, playerTurns);
        gameBoard.startGame();

    }
}
