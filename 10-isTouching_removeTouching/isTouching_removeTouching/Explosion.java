import greenfoot.*;
public class Explosion extends Actor {

    public Explosion() {
        setImage("boom.png");
    }

    public void act() {
        Greenfoot.delay(60);
        getWorld().removeObject(this);
    }
}