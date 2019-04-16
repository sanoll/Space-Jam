import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends ScrollingWorld
{
    GreenfootSound myMusic2 = new GreenfootSound("Drake - Gods Plan (Clean).mp3");
    Basketball ball = new Basketball();
    Buckets goal = new Buckets();
    BadGuy1 b1 = new BadGuy1();
    bugs bunny = new bugs();
    BadGuy2 b2 = new BadGuy2();
    BadGuy3 b3 = new BadGuy3();
    shoot shot = new shoot();
    /**
     * Constructor for objects of class SpacWorld.
     * 
     */
    public SpaceWorld()
    {
        super(600, 600, 1, true);
        addObject(new bugs(),150, 300);
        setPaintOrder(Counter.class, bugs.class, Basketball.class, Buckets.class);
        addObject(new Counter("Score: "), 50, 25);
        addObject(new BallCount("Balls: "), 150, 25);
    }

    public void act() {
        scroll();
        myMusic2.play();
        myMusic2.setVolume(30);
        balls();
        buckets();
        obstacles();
    }

    public void balls() {
        if (Greenfoot.getRandomNumber(500) == 1) {
            addObject(ball, 590, Greenfoot.getRandomNumber(600));
        }
    }

    public void buckets() {
        if (Greenfoot.getRandomNumber(500) == 1) {
            addObject(goal, 590, Greenfoot.getRandomNumber(600));
            
        }
    }
    public void obstacles() {
        if (Greenfoot.getRandomNumber(30) == 1)
        {
            addObject(b1, 600, Greenfoot.getRandomNumber(600));
        }
        if (Greenfoot.getRandomNumber(30) == 2)
        {
            addObject(b2, 600, Greenfoot.getRandomNumber(600));
        }
        if (Greenfoot.getRandomNumber(30) == 3)
        {
            addObject(b3, 600, Greenfoot.getRandomNumber(600));
        }
    }
}
