import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class medium extends mode
{
    public medium(){
       GreenfootImage image = getImage();  
       image.scale(180, 50);
       setImage(image);
    }
    public static int click = 0;
    hard h;//level 3
    easy e;//level 1
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){//0 pt neselectat, 1 pt selectat
            e.click = 0;
            h.click = 0;
            click = 1;
        }
        if(click == 1){//am ales levelul
            GreenfootImage image = new GreenfootImage("normal_clicked.png");
            image.scale(180, 50);
            setImage(image);
        }
        else{//am selectat alt level
            GreenfootImage image = new GreenfootImage("normalc.png");
            image.scale(180, 50);
            setImage(image);
        }
    }
}
