import greenfoot.*; 
public class lobster extends Actor
{
    
    
       private int pasos;
       
       private Counter contador;
       
       
          public lobster()
          {
                contador= new Counter ("Vidas:");
                contador.setValue(5);
            
                 pasos=0;
           }
           
           protected void addedToWorld(World world)
    {
          world.addObject(contador, 500, 80);
          
    }
       
        
          public void act()
           
          {
                move(5);
                pasos++;
                if(pasos==5)
                {
                 turn(Greenfoot.getRandomNumber(180)-90);        
                 pasos=0;
                }
               /* if(isTouching(cangrejo.class))
               {
                    
                   // contador.setValue(contador.getValue()-1);
                    setLocation(500,500);
                   // removeTouching(cangrejo.class);  
                    
                     
                    if(contador.getValue()==0)
                    {
                        Greenfoot.stop();   
                    }
                    
                } */
          }    
}
