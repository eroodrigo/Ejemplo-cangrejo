import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class MyWorld extends greenfoot.World
{ private ArrayList<gusano> lista;
  private int cantidad ;
    
    public MyWorld()
    {    this.cantidad=10;
       lista=new ArrayList<gusano>();
        super(560, 60, 1); 
       prepare();
    }

    
    
    
    
   
    private void prepare()
    {
         gusano gusano = new gusano();
          lista.add(gusano);
        for(int i=0;i<cantidad;i++)
        {
            gusano gusano = new gusano();
            lista.add(gusano);
        }
        
        lobster lobster = new lobster();
        addObject(lobster,171,205);
        gusano gusano = new gusano();
        addObject(gusano,329,325);
        cangrejo cangrejo = new cangrejo();
        addObject(cangrejo,201,125);
        gusano gusano2 = new gusano();
        addObject(gusano2,366,158);
        gusano gusano3 = new gusano();
        addObject(gusano3,40,424);
        gusano gusano4 = new gusano();
        addObject(gusano4,233,491);
        gusano gusano5 = new gusano();
        addObject(gusano5,415,453);
    }
}
