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
    }
    
    public void countBalls() {
        
    }
    
    public void countBuckets() {
        
    }
}
