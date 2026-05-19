import greenfoot.*;

public class Raumschiff extends Actor {
    
    public Raumschiff() {

    }

    public void act() {
        move(6);
        if (isAtEdge()) {
            turn(30);
        }
    }    
}
