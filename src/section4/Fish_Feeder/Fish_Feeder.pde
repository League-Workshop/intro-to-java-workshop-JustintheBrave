int foodX = (int)random(501);
int foodY = 0;
 void setup(){
 size(500, 500) ; 
 }
 
 void draw(){
 background(141,233,237);
 
 fill(108, 66, 13);
noStroke();
ellipse(foodX, foodY, 20, 20);
 
 foodY = foodY + 6;
 
 if(foodY>=height){
 foodX = (int)random(501);
 foodY = 0;
 }
 
 }
 
