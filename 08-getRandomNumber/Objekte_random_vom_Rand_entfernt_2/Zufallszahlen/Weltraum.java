import greenfoot.*;

public class Weltraum extends World {

    public Weltraum() {
        super(800, 600, 1);
        objekteMitRandomNumber();
        //objekteMitMinMaxMethode();
    }

    public void objekteMitMinMaxMethode() {
        for (int i = 0; i < 10; i++) {
            Zufallszahl zufallszahl = new Zufallszahl();
            Rakete rakete = new Rakete();
            addObject(rakete, zufallszahl.zufallszahlStartBisEnde(40, getWidth() - 40), zufallszahl.zufallszahlStartBisEnde(40, getHeight() - 40)); 
        }
    }

    public void objekteMitRandomNumber() {
        for (int i = 0; i < 10; i++) {
            int rand = 50;
            int xBereich = Greenfoot.getRandomNumber(getWidth() - 2*rand + 1) + rand;
            int yBereich = Greenfoot.getRandomNumber(getHeight() - 2*rand + 1) + rand;
            Rakete rakete = new Rakete();
            addObject(rakete, xBereich, yBereich);
        }
    }
}
