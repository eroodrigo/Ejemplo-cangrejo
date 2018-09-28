import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600
        , 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
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
