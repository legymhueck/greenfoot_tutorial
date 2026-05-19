import greenfoot.*;

public class Asteroid extends Actor {

    public void act() {
        if (Greenfoot.isKeyDown("right")) {
            if (isTouching(Raumschiff.class)) {
                Raumschiff getroffenesRaumschiff = (Raumschiff)getOneIntersectingObject(Raumschiff.class);            
                getWorld().showText("X-Koordinate Raumschiff: " + getroffenesRaumschiff.getX(), 150, 10);
                getWorld().showText("Y-Koordinate Raumschiff: " + getroffenesRaumschiff.getY(), 150, 30);
            }
            setLocation(getX() + 1, getY());
        }    
    }
}
