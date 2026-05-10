import greenfoot.*;

public class Weltraum extends World {
    private final Raumschiff r;
    private final GreenfootImage originalBackground;

    public Weltraum() {    
        super(800, 700, 1);   
        r = new Raumschiff();
        addObject(r, getWidth() / 2, getHeight() / 2);
        originalBackground = new GreenfootImage(getBackground());
        drawCoordinates();
    }

    public void act() {
        drawCoordinates();
    }

    private void drawCoordinates() {
        GreenfootImage bg = getBackground();
        bg.drawImage(originalBackground, 0, 0);

        GreenfootImage hud = new GreenfootImage(180, 36);
        hud.setColor(new Color(0, 0, 0, 170));
        hud.fill();
        hud.setColor(Color.WHITE);
        hud.setFont(new Font("Arial", false, false, 20));
        hud.drawString("x: " + r.getX() + "   y: " + r.getY(), 8, 25);

        bg.drawImage(hud, 10, 8);
    }
}
