import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
public class choose_animal extends World
{
    public choose_animal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 600, 1); 
        
        addObject(new Choose("CHOOSE YOUR PLAYER!"), 600, 230);//alege caracterul
        addObject(new easy(), 920, 320);//buton pt primul level
        addObject(new medium(), 920, 400);//buton pt al doilea level
        addObject(new hard(), 920, 480);//buton pt al treilea level
        addObject(new Text("WELCOME TO THE ANIMAL UNIVERSE!", 41, 300, 1), 630, 150);
        //bine ati venit!!
        
        addObject(new dog1(), 200, 400);//player 1
        addObject(new dog2(), 600, 400);//player 2
    }
    
    public void act(){
        
    }
}