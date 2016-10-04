import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleshipBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleshipBlue extends Actor
{
    /**
     * Act - do whatever the BattleshipBlue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int number;
    
    public BattleshipBlue(int x){
        number=x;
    }
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            world.removeObject(this);
            showText(number,this.getX(),this.getY());
        };
    }    
    
    
}
