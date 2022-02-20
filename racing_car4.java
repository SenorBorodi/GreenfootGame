import greenfoot.*;  

public class racing_car4 extends cars
{   
    public static int car4 = 0;//statusul playerului
    
     public racing_car4(){//adjustam imaginea
        GreenfootImage image = getImage();  
        image.scale(300, 125);
        setImage(image);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this) && car4 == 0) {//am dat click
            car4 = 1;
            Greenfoot.setWorld(new Subtraction_World());//schimbam lumea
            
        }
    }
}
