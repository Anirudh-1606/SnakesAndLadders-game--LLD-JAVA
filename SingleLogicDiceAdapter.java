public class SingleLogicDiceAdapter implements Dice {
    private SingleLogicDice singleLogicDice;

    public SingleLogicDiceAdapter(SingleLogicDice singleLogicDice) {
        this.singleLogicDice = singleLogicDice;
    }

    @Override
    public int rollDice() {
        // Llamar a la lógica actual del dado para obtener el resultado.
        return singleLogicDice.rollDice();
    }
}
