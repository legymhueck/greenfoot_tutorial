import java.util.*;
import greenfoot.*;

public class Weltraum extends World {

    public Weltraum() {
        super(800, 600, 1);
        prepare();
    }

    private void prepare() {

        addObject(new Raumschiff(), 50, 300); // Objekt, x-, y-Koordinate
        addObject(new Asteroid(), 500, 300); // Vor dem Raumschiff
    }
}
