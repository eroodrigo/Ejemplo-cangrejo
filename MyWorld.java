import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends greenfoot.World
{ 
  private int cantidad ;
  private lobster lobster;
  private cangrejo cangrejo;
    private GreenfootSound musica;
    public MyWorld()
    {    
      
        super(600, 600, 1); 
       prepare(10);
        lobster = new lobster();
        addObject(lobster,500,500);
        cantidad=10;
         cangrejo = new cangrejo();
        addObject(cangrejo,0,0);
        musica=new GreenfootSound("ufo-t-balt.mp3");
        
        
    }

    public void started()
    {
       // Greenfoot.playSound("ufo-t-balt.mp3");
       musica.playLoop();
    }
    
    
    public void stopped()
    {
       musica.pause();
        // Greenfoot.playSound("ufo-t-balt.mp3");
    }
    
    public lobster accedelangosta()
    {
        return lobster;
    }
    
    
   
    private void prepare(int cantidad)
    {
         
        for(int i=0;i<cantidad;i++)
        {
            gusano gusano = new gusano();
            int x=Greenfoot.getRandomNumber(540)+20;
            int y=Greenfoot.getRandomNumber(540)+20;
             addObject(gusano, x, y);
            
        }
       /* 
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
        addObject(gusano5,415,453); */
    }
    
    
    
}
