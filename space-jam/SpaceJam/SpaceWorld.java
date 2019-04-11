import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends ScrollingWorld
{
    Counter counter= new Counter();
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
        setPaintOrder(bugs.class, Basketball.class, Buckets.class, Counter.class);
        addObject(new Counter(), 100, 40);
    }

    public void act() {
        scroll();
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
    
    public Counter getCounter()
    {
        return counter;
}
}
