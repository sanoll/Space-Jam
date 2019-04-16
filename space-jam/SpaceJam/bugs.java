import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bugs extends Actor
{
    SpaceWorld world = (SpaceWorld) getWorld();
    Counter count = new Counter();
    int ballCount;
    int bucketCount;
    public bugs() {
        ballCount = 3;
        bucketCount = 0;
    }
    /**
     * Act - do whatever the bugs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shoot shot = new shoot();
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
            ballCount++;
            ((BallCount) getWorld().getObjects(BallCount.class).get(0)).add(1);
        }
        Buckets goal = (Buckets) getOneIntersectingObject(Buckets.class);
        if (goal != null) {
            Greenfoot.playSound("Dunking.mp3");
            ((Counter) getWorld().getObjects(Counter.class).get(0)).add(1);
            getWorld().removeObject(goal);
            bucketCount++;
            SpaceWorld spaceworld = (SpaceWorld)world;
        }
        shoot();
    }
    
    public void shoot() {
        if (Greenfoot.getKey() == "space" && ballCount > 0) {
            Greenfoot.playSound("3 Pointer Sound Effect.mp3");
            getWorld().addObject(new shoot(), 210, this.getY() + 20);
            ballCount--;
            ((BallCount) getWorld().getObjects(BallCount.class).get(0)).add(-1);
        }
    }
}
