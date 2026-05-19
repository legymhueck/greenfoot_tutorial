import greenfoot.*;

public class Raumschiff extends Actor {

    public void act() {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 1, getY());
        }

        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 1, getY());
        }

        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 1);
        }

        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 1);
        }

    }    
}
