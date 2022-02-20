import greenfoot.*; 

public class racing_car3 extends cars
{   
    public static int car3 = 0;//statusul playerului
    
    public racing_car3(){//adjustam imaginea
        GreenfootImage image = getImage();  
        image.scale(340, 140);
        setImage(image);
    }
    public void act()
    {   
        if (Greenfoot.mouseClicked(this)) {// am dat click
            car3 = 1;
            Greenfoot.setWorld(new Subtraction_World());//schimbam lumea
        }
    }
}

