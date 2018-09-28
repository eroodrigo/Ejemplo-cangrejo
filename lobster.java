import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Actor
{
    
    
       private int pasos;
       
       
       
       
          public lobster()
          {
           
           pasos=0;
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
           if(isTouching(cangrejo.class))
           {
                    removeTouching(cangrejo.class); 
           }
          }    
}
