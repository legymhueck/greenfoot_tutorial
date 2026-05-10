import greenfoot.*;

public class Weltraum extends World {

  public Weltraum() {
    super(800, 600, 1);
    // Anonyme Instanziierung eines Objektes
    addObject(new Raumschiff(), 254, 100);
    addObject(new Asteroid(), 100, 100);
  }
}
