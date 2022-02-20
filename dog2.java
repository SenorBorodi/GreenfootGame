import greenfoot.*; 

public class dog2 extends dogs
{
    public dog2(){//adjustam imaginea
       GreenfootImage image = getImage();  
       image.scale(400, 420);
       setImage(image);
    }
    public static int dog2;//am ales sau nu caracterul
    
    public void act()
    {
         if (Greenfoot.mouseClicked(this) && dog2 == 0) {//am dat click
            Greenfoot.setWorld(new Divide_World());//setam lumea
            dog2 = 1;//am ales player 2
        }
    }
}
