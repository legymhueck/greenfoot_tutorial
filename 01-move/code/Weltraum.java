import java.util.*;
import greenfoot.*;

public class Weltraum extends World {

    /* Die größe des Weltraums, d. h. 800 x 600 Pixel. Die Pixelgröße beträgt 1 */
    public Weltraum() {
        super(800, 600, 1);
        /* Die Methode zur Vorbereitung der Welt wird aufgerufen. */
        prepare();
    }

    /**
     * Die prepare()-Methode wird aufgerufen, um die Welt zu erschaffen.
     * Die Objekte für diese Welt werden auf die Welt gesetzt.
     */
    private void prepare() {
        Raumschiff r = new Raumschiff();
        addObject(r, 50, 300); // Objekt, x-, y-Koordinate
    }
}
