import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class gusano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gusano extends Actor
{
   private int cantidad ;
   private ArrayList
   
   public gusano()
   {
       this.cantidad=10;
       
       
       
    }
   
    
    
    protected void addedToWorld(World world)
    {    if(cantidad>0)
        {
          cantidad--;
          world.addObject(, (int)Math.random()*100,(int)Math.random()*100);
        }
    }
    
    
    
    public void act() 
     {   if(cantidad>0)
        {
        cantidad--;
          gusano.addObject(cantidad, (int)Math.random()*100,(int)Math.random()*100);
        }
        
      }
}