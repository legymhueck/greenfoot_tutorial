import greenfoot.*;

public class Raumschiff extends Actor {

    public void act() {
        move(4);
        if (isAtEdge()) {
            turn(15);
        }
    }
}
