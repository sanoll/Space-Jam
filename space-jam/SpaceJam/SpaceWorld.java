import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends ScrollingWorld
{
    int ballCount;
    int bucketCount;
    Basketball ball = new Basketball();
    Buckets goal = new Buckets();
    BadGuy1 b1 = new BadGuy1();
    bugs bunny = new bugs();
    BadGuy2 b2 = new BadGuy2();
    BadGuy3 b3 = new BadGuy3();
    /**
     * Constructor for objects of class SpacWorld.
     * 
     */
    public SpaceWorld()
    {
        super(600, 600, 1, true);
        addObject(new bugs(),100, 300);
        ballCount = 3;
        bucketCount = 0;
        setPaintOrder(bugs.class, Basketball.class, Buckets.class);
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
            if (ball.isAtEdge()) {
                removeObject(ball);
            }
        }
    }

    public void buckets() {
        if (Greenfoot.getRandomNumber(500) == 1) {
            addObject(goal, 590, Greenfoot.getRandomNumber(600));
            if (goal.isAtEdge()) {
                removeObject(goal);
            }
        }
    }
    public void obstacles() {
        if (Greenfoot.getRandomNumber(30) == 1)
        {
            addObject(b1, 600, Greenfoot.getRandomNumber(600));
            if (b1.getX() < 100) {
                removeObject(b1);
            }
        }
        if (Greenfoot.getRandomNumber(30) == 2)
        {
            addObject(b2, 600, Greenfoot.getRandomNumber(600));
            if (b2.getX() < 100) {
                removeObject(b2);
            }
        }
        if (Greenfoot.getRandomNumber(30) == 3)
        {
            addObject(b3, 600, Greenfoot.getRandomNumber(600));
            if (b3.getX() < 100) {
                removeObject(b3);
            }
        }
    }
    
    public int countBalls() {
        return ballCount;
    }
    
    public int countBuckets() {
        return bucketCount;
    }
}
