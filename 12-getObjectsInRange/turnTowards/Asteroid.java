import greenfoot.*;
import java.util.List;

public class Asteroid extends Actor {
    
    public Asteroid() {

    }

    public void act() {
        folgeRaumschiff();
        move(3);
    }

    public void folgeRaumschiff() {

        List<Raumschiff> raumschiffInUmgebung = getObjectsInRange(400, Raumschiff.class);
        if(raumschiffInUmgebung.size() > 0) {
            Actor eineRakete = raumschiffInUmgebung.get(0);
            turnTowards(eineRakete.getX(),eineRakete.getY());
        }   
    }
}

