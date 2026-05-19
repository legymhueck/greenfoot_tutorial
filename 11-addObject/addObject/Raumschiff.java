import greenfoot.*;

public class Raumschiff extends Actor {
    private boolean asteroidAlreadySpawned = false;

    public void act() {
        // Solange das Raumschiff den Asteroiden berührt, bleibt asteroidAlreadySpawned auf true
        // Wenn das Raumschiff den Asteroiden nicht mehr berührt, wird die Variable auf False gesetzt.
        // Damit werden nicht endlos Asteroiden gespawnt.
        if (isTouching(Asteroid.class)) {
            if (!asteroidAlreadySpawned) {
                World world = getWorld();
                int randomXInWorld = Greenfoot.getRandomNumber(world.getWidth());
                int randomYInWorld = Greenfoot.getRandomNumber(world.getHeight());
                world.addObject(new Asteroid(), randomXInWorld, randomYInWorld);    
                asteroidAlreadySpawned = true;
            }
        } else {
            asteroidAlreadySpawned = false;
        }
        if (isAtEdge()) {
            turn(180);
        }
        move(1);
    }
}
