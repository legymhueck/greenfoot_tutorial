import greenfoot.*;

public class Raumschiff extends Actor {

    public void act() {
        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }

        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        }

        if (Greenfoot.isKeyDown("up")) {
            move(10);
        }

        if (Greenfoot.isKeyDown("down")) {
            move(-10);
        }

    }    
}
