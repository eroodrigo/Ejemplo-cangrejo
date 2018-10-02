import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tiempo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tiempo extends Actor
{
    
    private SimpleTimer timer;
    private Counter contador;
    
    // se ejecuta al momento de crear un bjeto
    
    public tiempo()
    {
        
     timer= new SimpleTimer();
     contador= new Counter ("tiempo:");
     contador.setValue(30);
   
    }
   
    protected void addedToWorld(World world)
    {
          world.addObject(contador, 60, 20);
        
    }
    
    
    
    
    public void act() 
    {
        if(timer.millisElapsed() >1000)
        {//System.out.println(timer.millisElapsed());
            contador.setValue(contador.getValue()-1);
            if(contador.getValue()==0)
            {
             Greenfoot.stop();   
            }
            timer.mark();
            
        }
        
        
      //  System.out.println(timer.millisElapsed());
        
    }    
}
