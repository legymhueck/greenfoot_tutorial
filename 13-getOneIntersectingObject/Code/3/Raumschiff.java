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
            if (obj != null) {
                // Es wurde irgendein Objekt gefunden, das das Raumschiff berührt.
                obj.move(5);
            }
        }
    }    
}