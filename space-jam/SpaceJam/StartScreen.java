import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The start up screen for the Space Jam Game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends ScrollingWorld
{
    GreenfootSound myMusic = new GreenfootSound("Space_Jam_Theme_Song.mp3");
    SpaceWorld world = new SpaceWorld();
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    { 

        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1, true);



    }


    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new SpaceWorld());
        myMusic.play();
        myMusic.setVolume(30);
    }
}
