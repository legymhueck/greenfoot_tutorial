import java.util.*;
import greenfoot.*;

public class Weltraum extends World {

    /* Die groesse des Weltraums, d. h. 800 x 600 Pixel, Pixelgroesse 1 */
    public Weltraum() {
        super(800, 600, 1);
        /* Die Methode zur Vorbereitung der Welt wird aufgerufen. */
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Raumschiff r = new Raumschiff();
        addObject(r, 350, 150); // Objekt, x-, y-Koordinate

    }
}
