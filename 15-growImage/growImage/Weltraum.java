import greenfoot.*;

public class Weltraum extends World {

    public Weltraum() {    
        super(800, 600, 1);
        prepare();
    }
    
    public void prepare() {
        addObject(new ProtonWave(), getWidth() / 2, getHeight() / 2);
    }
}
