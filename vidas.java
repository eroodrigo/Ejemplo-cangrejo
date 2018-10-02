 import greenfoot.*;  


public class vidas extends Actor
{
    private Counter contador;
    
    public vidas()
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
        if(isTouching(cangrejo.class))
        {  
            contador.setValue(contador.getValue()-1);
            removeTouching(cangrejo.class);  
            
         if(contador.getValue()==0)
            {
             Greenfoot.stop();   
            }
            
        }
        
    }    
}
