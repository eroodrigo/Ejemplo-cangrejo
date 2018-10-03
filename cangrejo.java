import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class cangrejo extends Actor
{  private Counter contador;
    
    
    public cangrejo()
    {
        
        contador= new Counter ("Vidas:");
     contador.setValue(5);
        
        
    }
     protected void addedToWorld(World world)
    {
          world.addObject(contador, 500, 80);
          
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
         if(isTouching(lobster.class))
         {
             setLocation(0,0);
              
                    contador.setValue(contador.getValue()-1);
                   
                   // removeTouching(cangrejo.class);  
                    
                     
                    if(contador.getValue()==0)
                    {
                        Greenfoot.stop();   
                    }
             
             
            }
    }    
}
