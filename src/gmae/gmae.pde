int enemyX = 100;
int enemyY = 100;
int bulletX = 0;
int bulletY = (int)random(501);



void setup(){
  size(1000,500);
}

void draw(){
  background(250, 70, 3);

//bullets
  ellipse(bulletX, bulletY, 20,20);
    bulletX = bulletX+10;
      if(bulletX>=width){
       bulletY = (int)random(501);
       bulletX = 0;
      }
      ellipse(bulletX, bulletY, 20,20);
    bulletX = bulletX+10;
      
//guy
  rect(mouseX-5, mouseY+10, 10, 50);
  ellipse(mouseX, mouseY, 50, 50);
  
  //enemy
  ellipse(enemyX,enemyY,100,100);
  
  
}
