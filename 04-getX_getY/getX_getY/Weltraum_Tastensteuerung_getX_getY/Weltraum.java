import greenfoot.*;

public class Weltraum extends World {

    public Weltraum() {
        super(800, 600, 1);
        prepare();
    }
    
    private void prepare() {
        Raumschiff r = new Raumschiff();
        addObject(r, 50, 300);
    }
}
