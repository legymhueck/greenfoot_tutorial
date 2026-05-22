import greenfoot.*;

public class Weltraum extends World {

    private ProtonWave protonWave;

    public Weltraum() {
        super(800, 600, 1);
        prepare();
    }

    private void prepare() {
        protonWave = new ProtonWave();
        addObject(protonWave, getWidth() / 2, getHeight() / 2);
    }
}
