import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Divide_World extends World
{
    public static GreenfootSound crowd = new GreenfootSound("crowd.wav");
    //sunet ambiental
    
    public Divide_World()
    {    
        super(1100, 600, 1); 
        
        addObject(new cloud(), 50, 80);
        addObject(new cloud(), 200, 120);
        addObject(new cloud(), 400, 100);
        addObject(new cloud(), 700, 110);
        addObject(new cloud(), 940, 80);
        //adaugam nori care se misca pentru a simula trecea timpului si miscarea playerului
        
        addObject(new back_button(), 1030, 40);//home button
        
        addObject(new Text("CHOOSE THE CORRECT ANSWER USING DOWN AND UP KEYS!", 30, 300, 2), 550, 545);
        //explicam ideea jocului
        
        addObject(new RECT("rect2.png"), 540, 95);
        //adaugam fereastra in care vom plasa operatiile
    }
    dog1 dog1;//primul caracter
    dog2 dog2;//al doilea caracter
    
    public static int start = 0;//de cat timp a inceput
    
    public void act(){
         int count_good = getObjects(goodresult.class).size();
         //numarul de elemente din clasa rezultatului corect
        
        if(start == 100 && count_good == 0){//incepem jocul dupa 100 de cadre
            crowd.playLoop();//sunetul de fundal
            crowd.setVolume(30);//micsoram volumul
            addObject(new goodresult(0), 1150, 525);//adaugam raspunsul corect
            addObject(new BadAnswer(0), 1150, 430);//adaugam raspunsul gresit
            addObject(new Text("Score : 0", 50, 300, 2), 450, 160);//scorul
            start = 0;//reinitializam
        } 
        if(start < 101 && count_good == 0)
            start++;
        //incrementam doar daca sunt mai putin de 100 de cadre, in caz contrar nu are rost
            
        if(start == 100 && count_good == 0){//jocul a inceput!
            generate();//generam unele parti din lume
            removeObjects(getObjects(Text.class));//eliminam instructiunile   
        }
    }
    public void generate(){
        if(dog1.dog1 == 1){//verificam daca am dat click pe playerul 1
            addObject(new dog1(), 100, 435);//adaugam playerul
            dog1.dog1 = 2;
            //notam cu 2 variabila insemnand ca am dat click pe player si l-am si generat
        }
        if(dog2.dog2 == 1){//verificam daca am dat click pe playerul 2
            addObject(new dog1(), 100, 415);//adaugam playerul
            dog2.dog2 = 2;
            dog1.dog1 = 2;
            //notam cu 2 variabila insemnand ca am dat click pe player si l-am si generat
        }
        if(start == 100){
            addObject(new Subtraction(0), 730, 200);
            //adaugam operatiile pe care va trebui sa le rezolvam
        }
    }
}
