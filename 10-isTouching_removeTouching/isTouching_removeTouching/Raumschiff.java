import java.util.*;
import greenfoot.*;

public class Raumschiff extends Actor {

    public void act() {
        if (isTouching(Asteroid.class)) {
            World world = getWorld();
            world.addObject(new Explosion(), this.getX(), this.getY()); // An den aktuellen Koordinaten des Raumschiffs
            world.removeObject(this);
        }
        move(1);
    }
}
