import greenfoot.*;

public class Weltraum extends World {

  public Weltraum() {
    super(800, 600, 1);
    prepare();
  }
  private void prepare() {
    Raumschiff raumschiff = new Raumschiff();
    addObject(raumschiff, 50, 300);
  }
}
