import greenfoot.*;

public class TextAusgabe extends Actor {
    /**
     * Attribute
     */


    /**
     * Konstruktor
     */
    public TextAusgabe(String pText) {
        GreenfootImage text = new GreenfootImage(200, 100);
        text.drawString(pText, 100, 100);
        this.setImage(text);
    }

    public void act() {
        
    }
}
