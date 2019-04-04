import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bugs extends Actor
{
    /**
     * Act - do whatever the bugs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+9);
            setRotation(360);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-9);
            setRotation(360);
        }
    }
}
