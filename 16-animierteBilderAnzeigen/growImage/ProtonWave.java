import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Die Klasse ProtonWave stellt eine wachsende Welle dar, die animiert wird,
 * indem sie in jedem Schritt ein größeres Bild anzeigt.
 */
public class ProtonWave extends Actor {
    // Liste mit allen vorberechneten Bildern der Welle in verschiedenen Größen
    private List<GreenfootImage> imagesOfProtonWave;
    // Index des aktuell angezeigten Bildes
    private int currentImage = 0;

    /**
     * Konstruktor: Erzeugt alle Bilder für die Animation und setzt das Startbild.
     */
    public ProtonWave() {
        imagesOfProtonWave = new ArrayList<>(); // Initialisiere die Bildliste
        int numberOfImages = 20; // Anzahl der Animationsschritte
        GreenfootImage baseImage = new GreenfootImage("wave.png"); // Ursprungsbild
        // Erzeuge für jeden Animationsschritt ein neues Bild mit wachsender Größe
        for (int i = 0; i < numberOfImages; i++) {
            int size = (i + 1) * (baseImage.getWidth() / numberOfImages); // Neue Größe berechnen
            GreenfootImage img = new GreenfootImage(baseImage); // Kopie des Ursprungsbilds
            img.scale(size, size); // Bild auf neue Größe skalieren
            imagesOfProtonWave.add(img); // Bild zur Liste hinzufügen
        }
        setImage(imagesOfProtonWave.get(0)); // Setze das erste Bild als Startbild
    }

    /**
     * Wird in jedem "Act"-Schritt von Greenfoot aufgerufen.
     * Sorgt dafür, dass die Welle wächst, indem das nächste Bild gesetzt wird.
     */
    public void act() {
        grow();
    }

    /**
     * Setzt das nächste Bild aus der Liste, sodass die Welle größer erscheint.
     * Wenn alle Bilder gezeigt wurden, passiert nichts mehr.
     */
    private void grow() {
        // Prüfe, ob noch weitere Bilder vorhanden sind
        if (currentImage != imagesOfProtonWave.size() - 1) { // Der letzte Index ist size - 1
            currentImage++; // Erhöhe den Index (erstes Bild wurde schon im Konstruktor gesetzt)
            setImage(imagesOfProtonWave.get(currentImage)); // Setze das nächste Bild
        }
        // Optional: Hier könnte man das Objekt entfernen, wenn die Animation fertig ist
        // if (currentImage == imagesOfProtonWave.size() - 1) getWorld().removeObject(this);
    }
}