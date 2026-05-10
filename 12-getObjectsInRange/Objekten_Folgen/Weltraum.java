import greenfoot.*;

public class Weltraum extends World {
    /**
     * Attribute
     */

    /**
     * Konstruktor
     */
    public Weltraum() {
        super(1200, 800, 1);
        addObject(new Raumschiff(), 100, 100);
        addObject(new Asteroid(), 480, 100);
    }
}
