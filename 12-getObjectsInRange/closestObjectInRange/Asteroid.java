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
        folgeDerRakete();
        pralleAmRandAb();
        move(1);
    }

    public void folgeDerRakete() {
        int distanz = 400;
        Actor closest = null;
        int zufallszahl = Greenfoot.getRandomNumber(50);
        if (zufallszahl == 9) {
            if (!getObjectsInRange(distanz, Rakete.class).isEmpty()) {
                for (Object object: getObjectsInRange(distanz, Rakete.class)) {
                    Actor eineRakete = (Actor)object;
                    int abstandZurRakete = (int)Math.hypot(eineRakete.getX() -getX(), eineRakete.getY() - getY());
                    if (closest == null || abstandZurRakete < distanz) {
                        closest = eineRakete;
                        distanz = abstandZurRakete;
                    }
                }
                turnTowards(closest.getX(), closest.getY());
            }
        }
    }

    public void pralleAmRandAb() {
        if (isAtEdge()) {
            turn(30);
        }
    }
}

