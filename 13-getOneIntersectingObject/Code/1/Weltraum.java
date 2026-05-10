import greenfoot.*;

public class Weltraum extends World {

  public Weltraum() {
    super(600, 400, 1);
    // Anonyme Instanziierung eines Objektes
    addObject(new Raumschiff(), 100, 100);
    addObject(new Asteroid(), 180, 100);
  }
}
