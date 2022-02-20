import greenfoot.*;  

public class back_button extends gametext
{
    public back_button(){//adjustam imaginea
        GreenfootImage image = getImage(); 
        image.scale(120, 60);
        setImage(image);
    }
    dog1 dog1;//player din lumea impartirilor
    car car1; // player din lumea scaderilor
    Divide_World divide_w;//lumea impartirilor
    Subtraction_World minus_w;//lumea scaderilor
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){ //resetam lumea
            dog1.dog1 = 0;//nu e ales
            dog1.cnt = 1;//e pe prima banda
            car1.cnt = 1;//e pe prima banda
            
            divide_w.crowd.stop();//oprim muzica
            minus_w.music.stop();//oprim sunetul
            
            Greenfoot.setWorld(new Start());
        }
    }
}
