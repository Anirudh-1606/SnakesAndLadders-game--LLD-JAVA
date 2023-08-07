public class GameEndObserver implements GameObserver {
    @Override
    public void update(Player player) {
        System.out.println("Congratulations, " + player.getName() + "! You won the game!");
        // Realizar otras acciones especiales para el ganador si es necesario
    }
}
