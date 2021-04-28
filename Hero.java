import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
            // Add your action code here.
        firepeluru();
        moveHero();
}
private void moveHero(){
        //kanan dan kiri
        if(Greenfoot.isKeyDown("D")){
            setLocation(getX()+5, getY());  
    }else if (Greenfoot.isKeyDown("A")){
        setLocation(getX()-5, getY());
    }
    
    //atas dan bawah
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY()-5);  
    }else if (Greenfoot.isKeyDown("S")){
        setLocation(getX(), getY()+5);
    }
    
    
    
}
    int peluruCounter = 0;
    private void firepeluru(){
         peluru peluru = new peluru();
        
        peluruCounter++;
        
        if (peluruCounter==30){
            getWorld().addObject(peluru, getX(), getY());
            peluruCounter = 0;
        }
    }  
}