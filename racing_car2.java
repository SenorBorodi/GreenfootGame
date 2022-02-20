import greenfoot.*; 

public class racing_car2 extends cars
{
    public static int car2 = 0;//statusul playerului
    
     public racing_car2(){//adjustam imaginea
        GreenfootImage image = getImage();  
        image.scale(300, 120);
        setImage(image);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            car2 = 1;//am ales
            Greenfoot.setWorld(new Subtraction_World());//incepem jocul
        }
    }
}
