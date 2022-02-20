import greenfoot.*;  

public class choose_car extends World
{
    Start First_World;
    
    public choose_car()
    {    
        super(1100, 600, 1); 
        
        prepare();//pregatim lumea
    }    
    void prepare(){
        addObject(new Choose("CHOOSE YOUR CAR!"), 600, 230);//alege playerul
        addObject(new racing_car(), 200, 300);//player 1
        addObject(new racing_car2(), 600, 300);//player 2
        addObject(new racing_car3(), 200, 500);//player 3
        addObject(new racing_car4(), 600, 490);//player 4
        addObject(new easy(), 920, 320);//buton pt level 1
        addObject(new medium(), 920, 400);//buton pt level 2
        addObject(new hard(), 920, 480);//buton pt level 3
        
        addObject(new Text("WELCOME TO THE CAR UNIVERSE!", 41, 300, 1), 650, 150);
        //bine ati venit!
    }
}
