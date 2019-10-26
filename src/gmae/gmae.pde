int enemyX = 100;
int enemyY = 100;
int health = 100;
int bulletX = 1000;
int bullet2X = 0;

void setup(){
  size(1000,500);
}

void draw(){
  background(0,0,0);

//border
  fill(255,255,255);
  rect(0,200,1001,10);
      
      
      
//guy
fill(255,255,255);
  rect(mouseX-5, mouseY+10, 10, 50);
  ellipse(mouseX, mouseY, 50, 50);
  
//enemy
  fill(255,255,255);
  ellipse(enemyX,enemyY,100,100);
   //eyes
    fill(0,0,0);
    ellipse(enemyX-15, enemyY-10, 10, 10);
    ellipse(enemyX+15, enemyY-10, 10, 10);
    
//attack
fill(255,255,255);
ellipse(bulletX,250,50,50);
    
    bulletX = bulletX -10;
    
fill(255,255,255);
ellipse(bullet2X,450,50,50);
    
   bullet2X = bullet2X +10;

}

    
 
    
    
