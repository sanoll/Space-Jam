import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is to create a scrolling world for our game.
 * 
 * @author Dillon Thompson 
 * @version 4.2.19
 */
public class ScrollingWorld extends World
{
    int speed;
    int score;
    /**
     * Constructor for objects of class ScrollingWorld.
     * 
     */
    public ScrollingWorld(int width, int height, int res, boolean bounded)
    {    
        super(width, height, res, bounded); 
        speed = -2;
        score = 0;
    }
    
    public void scroll() {
        GreenfootImage bg = getBackground();
        getBackground().drawImage(bg, speed, 0);
        getBackground().drawImage(bg, getWidth() + 5, 0);
    }
}
