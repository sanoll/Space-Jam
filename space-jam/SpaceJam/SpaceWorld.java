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
    }

    public void act() {
        scroll();
        balls();
        buckets();
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
    
    public int countBalls() {
        return ballCount;
    }
    
    public int countBuckets() {
        return bucketCount;
    }
}
