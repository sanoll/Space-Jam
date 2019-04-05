import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstacles extends Actor
{
    /**
     * Act - do whatever the obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-4, getY());
        obstacleimg();
    }    
    public void obstacleimg()
    {
        if (Greenfoot.getRandomNumber(3) == 1) {
            setImage("badguy22.png");
        }
        else if (Greenfoot.getRandomNumber(3) == 2){
            setImage("badguy33.png");
        }
        else {
            setImage("badguy44.png");
        }
    }
}
