import greenfoot.*;

public class Raumschiff extends Actor {

    public void act() {
        tastaturSteuerung();
    }

    public void tastaturSteuerung() {
        if (Greenfoot.isKeyDown("up")) {
            move(2);
        }

        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }

        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        }
    }

}
