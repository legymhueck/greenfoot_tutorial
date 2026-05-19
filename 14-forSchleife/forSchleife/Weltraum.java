import greenfoot.*;
import java.util.List;

public class Weltraum extends World {

    private static final int REMOVE_INTERVAL = 20;
    private int removeTimer = REMOVE_INTERVAL;

    public Weltraum() {    
        super(800, 600, 1);
        prepare();
    }

    public void act() {
        removeTimer--;
        if (removeTimer <= 0) {
            removeOneRaumschiff();
            removeTimer = REMOVE_INTERVAL; // Wieder auf Startwert setzen
        }
    }

    private void removeOneRaumschiff() {
        List<Raumschiff> alleRaumschiffe = getObjects(Raumschiff.class);
        if (!alleRaumschiffe.isEmpty()) {
            removeObject(alleRaumschiffe.get(alleRaumschiffe.size() - 1));
        }
    }
    
    public void prepare() {
        int numberOfActors = 10;
        for (int i = 0; i <= numberOfActors; i++) {
            addObject(new Asteroid(), Greenfoot.getRandomNumber(getWidth() - 40), Greenfoot.getRandomNumber(getHeight() - 40));
            
            addObject(new Raumschiff(), Greenfoot.getRandomNumber(getWidth() - 40), Greenfoot.getRandomNumber(getHeight() - 40));
        }
        
    }
}
