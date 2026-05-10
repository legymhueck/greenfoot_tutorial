import greenfoot.*;
import java.util.List;

public class Asteroid extends Actor {
    /**
     * Attribute
     */

    /**
     * Konstruktor
     */
    public Asteroid() {

    }

    public void act() {
        folgeRaumschiff();
        move(6);
    }

    public void folgeRaumschiff() {

        List<Raumschiff> raumschiffInUmgebung = getObjectsInRange(400, Raumschiff.class);
        if(raumschiffInUmgebung.size() > 0) {
            Actor eineRakete = raumschiffInUmgebung.get(0);
            int targetX = eineRakete.getX();
            int targetY = eineRakete.getY();
            turnTowards(targetX,targetY);
        }   
    }
}

