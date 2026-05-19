import greenfoot.*;

public class Raumschiff extends Actor {
    /**
     * Objektvariablen / Instanzvariablen / Attribute
     */

    /**
     * Konstruktor
     */
    public Raumschiff() {

    }

    public void act() {
        move(1);
        if (isTouching(Asteroid.class)) {
            Asteroid asteroid = (Asteroid)getOneIntersectingObject(Asteroid.class);
            asteroid.move(10);
        }
    }    
}