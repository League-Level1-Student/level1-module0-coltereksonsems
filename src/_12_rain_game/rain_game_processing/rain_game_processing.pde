//Runs once
void setup(){
  size (500,500);
}

//Game variables

int score =0;
int Y=0;
//Game loop
int X = (int)random(0,width);
void draw(){ 
   Y+=3;
  background (29,31,157);
  fill (165,166,240);
  stroke (0,0,0);
  ellipse (X,Y,5,5);
  
  if( Y > height) {
    checkCatch(X);
    Y=0;
    X=(int) random(0,width);
  }
  fill(124,120,120);
  rect(mouseX,490,30,10);
  
  

     fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
 }
