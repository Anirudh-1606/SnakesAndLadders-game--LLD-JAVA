
public class Player {
    private String name;
    private int location = 0;

    Player(String name) {
        this.name = name;

    }

    public void setLocation(int loc) {
        this.location = loc;
    }

    public int getLocation() {
        return this.location;
    }

    public String getName() {
        return name;
    }
}
