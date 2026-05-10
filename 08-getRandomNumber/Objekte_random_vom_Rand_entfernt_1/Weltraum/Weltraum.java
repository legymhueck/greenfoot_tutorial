import greenfoot.*;

public class Weltraum extends World {
    
    public Weltraum() {

        super(1000, 800, 1);

        Rakete rakete = new Rakete();
        addObject(rakete, 100, 100);

        for (int i = 0; i < 10; i++) {
            int x = (Greenfoot.getRandomNumber(getWidth() - 120 + 1) + 60);
            int y = (Greenfoot.getRandomNumber(getHeight() - 120 +1) + 60);
            Asteroid asteroid = new Asteroid();
            addObject(asteroid, x, y);
        }
    }
}
