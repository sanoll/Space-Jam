import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shoot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shoot extends Actor
{
    bugs bunny = new bugs();
    /**
     * Act - do whatever the shoot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if (this.isAtEdge()) {
            getWorld().removeObject(this);
        }
        obstacles badGuys = (obstacles) getOneIntersectingObject(obstacles.class);
        if (badGuys != null) {
            getWorld().removeObject(badGuys);
        }
    } 
}
