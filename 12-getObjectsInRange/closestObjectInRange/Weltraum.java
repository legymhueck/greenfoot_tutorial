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
        Rakete rakete = new Rakete();
        addObject(rakete, 100, 100);

        for (int i = 0; i < 10; i++) {
            Asteroid asteroid = new Asteroid();
            addObject(asteroid, Greenfoot.getRandomNumber(getWidth() - 20), (Greenfoot.getRandomNumber(getHeight() - 20)));
        }
    }
}
