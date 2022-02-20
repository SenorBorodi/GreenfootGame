import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class linie extends Other
{

    public linie(){//adjustam imaginea
        GreenfootImage image = getImage();  
        image.scale(60, 15);
        setImage(image);
    }
    Subtraction_World speed;
    
    public void act()
    {   int good_res = getWorld().getObjects(goodresult.class).size();//nr de elem din clasa
        
        if(good_res > 0){//doar in cazul in care a inceput jocul
            setLocation(getX() - 7, getY());
        
            int a = 1;//limita
            int w = getWorld().getWidth();//latimea
            int h = getWorld().getHeight();//inaltimea
            int x = getX();//x curent
            int y = getY();//y curent
             
            if (x < a || x > w-a-1) setLocation(w-x-1, y);
            if (y < a || y > h-a-1) setLocation(x, w-y-1);
            //atinge limita deci schimbam pozitia
        }
    }
}
