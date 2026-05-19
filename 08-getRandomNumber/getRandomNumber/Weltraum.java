import greenfoot.*;

public class Weltraum extends World {

    public Weltraum() {
        super(800, 600, 1);
        spawneAsteroiden();
    }

    public void spawneAsteroiden() {
        addObject(new Asteroid(), Greenfoot.getRandomNumber(getWidth() - 80) + 40,
            Greenfoot.getRandomNumber(getHeight() - 80) + 40);
    }
}
