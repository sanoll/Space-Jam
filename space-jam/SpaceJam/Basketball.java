import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Basketball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basketball extends Collectables
{

    public Basketball() {
        setLocation(600, Greenfoot.getRandomNumber(600));
    }

    /**
     * Act - do whatever the Basketball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-5);
    }    
}
