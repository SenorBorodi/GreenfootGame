import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ShipPlayer extends start_actors
{

    public void act()
    {
        
        moveAround();
        enterMazeGame();
    }
    public void enterMazeGame() {
        if (isTouching(Plus.class)) {
            Greenfoot.setWorld(new choose_car());
        }
        if (isTouching(Imparte.class)) {
            Greenfoot.setWorld(new choose_animal());
        }
    }
    public void moveAround() {
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(4);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(4);
        }
        
    }
}