import greenfoot.*;

public class Raumschiff extends Actor {

    public void act() {
        move(8);
        if (isAtEdge()) {
            turn(30);
        }
    }
}
