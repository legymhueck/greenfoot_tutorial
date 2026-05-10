import greenfoot.*;

public class Zufallszahl extends Actor {

    public int zufallszahlStartBisEnde(int pStart, int pEnde) {
        int anzahlZufallszahlen = Greenfoot.getRandomNumber(pEnde - pStart + 1);
        int oberesLimit = anzahlZufallszahlen + pStart;
        return oberesLimit;
    }
}
