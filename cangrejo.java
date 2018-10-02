import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cangrejo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cangrejo extends Actor
{  private Counter contador;
    
    
    public cangrejo()
    {
        
        contador= new Counter ("Vidas:");
     contador.setValue(5);
        
        
    }
    
    
    
    public void act() 
    {
        // Add your action code here.
        super.move(4);
       
        if(Greenfoot.isKeyDown("right"))
        {
            
            turn(3);
        }
         if(Greenfoot.isKeyDown("left"))
        {
            
            turn(-3);
        }
        
        if(isTouching(gusano.class))
        {
         removeTouching(gusano.class);   
        }
  
    }    
}
