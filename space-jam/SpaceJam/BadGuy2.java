import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadGuy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadGuy2 extends obstacles
{
    SpaceWorld world = (SpaceWorld) getWorld();
    /**
     * Act - do whatever the BadGuy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-6);
        bugs bunny = (bugs) getOneIntersectingObject(bugs.class);
        if (bunny != null) {
            getWorld().removeObject(bunny);
            Greenfoot.stop();
        }
    }    
}
