import greenfoot.*;

public class TextAusgabe extends Actor {

    public void act() {
        GreenfootImage img = new GreenfootImage(500, 100);
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(Color.RED);
        img.setFont(new Font("OptimusPrinceps", false, false , 100));
        img.drawString("YOU DIED", 10, 90);
        setImage(img);
    }
}
