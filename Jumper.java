
//Generic Class

public class Jumper {
    private int startPoint;
    private int endPoint;

    Jumper(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }
}

// Inheritence

class Snakes extends Jumper {

    // usually for Snakes, startPoint > endPoint

    Snakes(int startPoint, int endPoint) {
        super(startPoint, endPoint);
    }

}

class Ladders extends Jumper {

    // usually for Snakes, startPoint < endPoint

    Ladders(int startPoint, int endPoint) {
        super(startPoint, endPoint);
    }
}