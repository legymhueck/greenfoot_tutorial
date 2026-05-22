import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Die Klasse ProtonWave stellt eine wachsende Welle dar, die animiert wird,
 * indem sie in jedem Schritt ein größeres Bild aus einer vorberechneten Liste anzeigt.
 * 
 * Lernziel: Bilder werden einmalig in einer Liste gespeichert und per Index abgerufen –
 * das ist effizienter als das Skalieren in jedem Act-Schritt.
 */
public class ProtonWave extends Actor {
    // Liste mit allen vorberechneten Bildern der Welle in verschiedenen Größen
    private List<GreenfootImage> imagesOfProtonWave;
    // Index des aktuell angezeigten Bildes
    private int currentImageNumber;
    // Gibt an, ob die Welle aktuell wächst oder schrumpft
    private boolean growing;

    /**
     * Konstruktor: Erzeugt alle Bilder für die Animation und setzt das Startbild.
     */
    public ProtonWave() {
        imagesOfProtonWave = new ArrayList<>();
        int numberOfImages = 20;
        GreenfootImage baseImage = new GreenfootImage("wave.png");

        // Erzeuge für jeden Animationsschritt ein neues Bild mit wachsender Größe.
        // Alle Bilder werden hier einmalig berechnet und in der Liste gespeichert.
        for (int i = 0; i < numberOfImages; i++) {
            int size = (i + 1) * (baseImage.getWidth() / numberOfImages);
            GreenfootImage img = new GreenfootImage(baseImage);
            img.scale(size, size);
            imagesOfProtonWave.add(img);
        }

        animationZuruecksetzen();
    }

    /**
     * Wird aufgerufen, sobald das Objekt zur Welt hinzugefügt wird.
     * Zeigt zu Beginn die Debug-Informationen an (nur zur Veranschaulichung im Unterricht).
     */
    @Override
    protected void addedToWorld(World world) {
        // Startbild ist immer Index 0 – die Ausgabe dient nur zur Kontrolle
        zeigeDebugInfo();
    }

    /**
     * Setzt die Startwerte der Animation zurück.
     * Kann z. B. per Tastendruck erneut aufgerufen werden (siehe act()).
     */
    public void animationZuruecksetzen() {
        currentImageNumber = 0;
        growing = true;
        setImage(imagesOfProtonWave.get(currentImageNumber));
    }

    /**
     * Wird in jedem "Act"-Schritt von Greenfoot aufgerufen.
     * Steuert das Wachsen und Schrumpfen der Welle.
     * Mit "R" kann die Animation jederzeit neu gestartet werden.
     */
    public void act() {
        // Neustart der Animation per Tastendruck – zeigt Wiederverwendung von animationZuruecksetzen()
        if (Greenfoot.isKeyDown("r")) {
            animationZuruecksetzen();
        }

        if (growing) {
            grow();
            if (currentImageNumber == imagesOfProtonWave.size() - 1) {
                growing = false;
            }
        } else {
            shrink();
            if (currentImageNumber == 0) {
                growing = true;
            }
        }
    }

    /**
     * Zeigt das nächste (größere) Bild aus der Liste an.
     * 
     * Alternativ könnte man hier das Objekt entfernen, wenn die Animation fertig ist:
     *   getWorld().removeObject(this);
     * Das wäre sinnvoll, wenn die Welle nur einmal abgespielt werden soll.
     */
    private void grow() {
        if (currentImageNumber < imagesOfProtonWave.size() - 1) {
            currentImageNumber++;
            setImage(imagesOfProtonWave.get(currentImageNumber));
            zeigeDebugInfo();
        }
    }

    /**
     * Zeigt das vorherige (kleinere) Bild aus der Liste an.
     */
    private void shrink() {
        if (currentImageNumber > 0) {
            currentImageNumber--;
            setImage(imagesOfProtonWave.get(currentImageNumber));
            zeigeDebugInfo();
        }
    }

    /**
     * Zeigt den aktuellen Listenindex und die Bildgröße in der Welt an.
     * Diese Methode dient nur der Veranschaulichung im Unterricht –
     * in einem fertigen Spiel würde man sie weglassen.
     */
    private void zeigeDebugInfo() {
        if (getWorld() != null) {
            getWorld().showText("Bildnummer: " + currentImageNumber, 83, 40);
            getWorld().showText(
                "Breite: " + imagesOfProtonWave.get(currentImageNumber).getWidth() +
                " ; Hoehe: " + imagesOfProtonWave.get(currentImageNumber).getHeight(),
                115, 80
            );
        }
    }
}
