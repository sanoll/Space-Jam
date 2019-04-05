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
    /**
     * Constructor for objects of class SpacWorld.
     * 
     */
    public SpaceWorld()
    {
        super(600, 600, 1, true);
        addObject(new bugs(),100, 300);
        ballCount = 0;
        bucketCount = 0;
        setPaintOrder(bugs.class, Basketball.class, Buckets.class);
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
        if (Greenfoot.getRandomNumber(100) == 1)
        {
            addObject(b1, 600, Greenfoot.getRandomNumber(600));
            if (b1.getX() < 100) {
                removeObject(b1);
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
