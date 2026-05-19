import greenfoot.*;

public class Weltraum extends World {

    public Weltraum() {    
        super(800, 600, 1);
        Raumschiff raumschiff = new Raumschiff();
        int raumschiffMitteX = raumschiff.getImage().getWidth() / 2;
        int raumschiffMitteY = raumschiff.getImage().getHeight() / 2;
        int mitteX = getWidth() / 2;
        int mitteY = getHeight() / 2;
        addObject(raumschiff, mitteX - raumschiffMitteX, mitteY - raumschiffMitteY);
    }
}
