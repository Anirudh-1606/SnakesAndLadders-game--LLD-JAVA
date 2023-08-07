import java.util.Queue;

public class PlayerQueueIterator implements PlayerIterator {
    private Queue<Player> playerQueue;

    public PlayerQueueIterator(Queue<Player> playerQueue) {
        this.playerQueue = playerQueue;
    }

    @Override
    public boolean hasNext() {
        return !playerQueue.isEmpty();
    }

    @Override
    public Player next() {
        return playerQueue.poll();
    }
}
