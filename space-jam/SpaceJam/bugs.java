import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bugs extends Actor
{
    /**
     * Act - do whatever the bugs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        SpaceWorld world = (SpaceWorld) getWorld();
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
        Basketball ball = (Basketball) getOneIntersectingObject(Basketball.class);
        if (ball != null) {
            getWorld().removeObject(ball);
            world.ballCount++;
        }
        Buckets goal = (Buckets) getOneIntersectingObject(Buckets.class);
        if (goal != null) {
            getWorld().removeObject(goal);
            world.bucketCount++;
        }
    }
}
