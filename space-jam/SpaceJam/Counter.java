import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The score counter for the game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score;
    bugs bunny = new bugs();
    public Counter() {
        score = bunny.bucketCount;
    }
   
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + bunny.bucketCount, 24, Color.GREEN, Color.BLACK));
    } 
    public void addScore()
    {
        score++;
    }    
}
