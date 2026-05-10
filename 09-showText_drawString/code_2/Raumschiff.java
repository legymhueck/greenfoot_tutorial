import greenfoot.*;

public class Raumschiff extends Actor {
    
    public Raumschiff() {
        
    }

    public void act() {
        move(4);
        if (isAtEdge()) {
            turn(15);
        }
    }
}
