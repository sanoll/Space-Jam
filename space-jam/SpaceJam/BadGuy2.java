import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadGuy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadGuy2 extends obstacles
{
    /**
     * Act - do whatever the BadGuy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-6);
        removeTouching(bugs.class);
    }    
}
