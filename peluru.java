import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class peluru extends Actor
{
    /**
     * Act - do whatever the peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 60 kali per detik/frame per second
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
    }  
  }
}