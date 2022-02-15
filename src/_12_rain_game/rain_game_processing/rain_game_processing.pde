//Runs once
void setup(){
  size (500,500);
}

//Game variables
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
    Y=0;
    X=(int) random(0,width);
  }
  fill(124,120,120);
  rect(200,590,10,5);
}
