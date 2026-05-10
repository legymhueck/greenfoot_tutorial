import greenfoot.*;

public class Rakete extends Actor {
    /**
     * Objektvariablen / Instanzvariablen / Attribute
     */

    /**
     * Konstruktor
     */
    public Rakete() {

    }

    public void act() {
        move(1);
        if (Greenfoot.isKeyDown("up")) {
            move(10);
        }
                
        if (Greenfoot.isKeyDown("left")) {
            turn(-10);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(10);
        }
    }    
}
