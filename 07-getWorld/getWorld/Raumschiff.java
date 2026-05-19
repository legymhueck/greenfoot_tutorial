import greenfoot.*;

public class Raumschiff extends Actor {

    public void act() {
        Weltraum w = getWorldOfType(Weltraum.class);
        Weltraum wR = (Weltraum)getWorld();
        
        getWorld().showText("Breite: " + w.getWidth(), 100, 10);
        getWorld().showText("Breite: " + wR.getWidth(), 100, 50);
    }    
}
