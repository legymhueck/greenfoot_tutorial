import greenfoot.*;

public class Weltraum extends World {
    private Raumschiff r;

    public Weltraum() {    
        super(800, 700, 1);
        r = new Raumschiff();        
        addObject(r, 100, 100);
        showText("x:" + r.getX() + ", y:" + r.getY(), 100, 20);
    }

    public void act() {
        showText("x:" + r.getX() + ", y:" + r.getY(), 100, 20);
    }
}
