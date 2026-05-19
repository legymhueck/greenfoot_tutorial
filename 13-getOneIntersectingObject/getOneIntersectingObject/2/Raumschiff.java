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
            Actor obj = getOneIntersectingObject(null);
            if (obj instanceof Asteroid) {
                Asteroid asteroid = (Asteroid) obj;
                asteroid.move(10);
            }
        }
    }    
}