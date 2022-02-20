import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class racing_car extends cars
{
    public static int car1 = 0;//pt a verifica statusul actorului
    
    public racing_car(){//adjustam imaginea
        GreenfootImage image = getImage();  
        image.scale(300, 120);
        setImage(image);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && car1 == 0) {//daca am dat click
            car1 = 1;//am ales
            Greenfoot.setWorld(new Subtraction_World());//lume noua
        }
    }
}
