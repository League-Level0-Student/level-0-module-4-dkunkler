

PImage creeper;     //at the top of your program
PImage minecraft;
int creepX;
int creepY;
int creepSize = 15;
boolean found = false;
String result = "";
void setup()
{
  size(1920,924); 
  
  minecraft = loadImage("minecraft.jpg");     //in setup method
  
  background(minecraft);          //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(creepSize,creepSize);     //in setup method
  moveCreeper();
  
}


void draw()
{
  
  background(minecraft);          //in setup method
  image(creeper, creepX, creepY);     //in draw method
    
  if(dist(creepX,creepY,mouseX,mouseY) < creepSize)  
  {
    fill(0,180,0);
    found = true;
  }
  else
  {
    fill(180,0,0);
    found = false;
  }
  if(mousePressed && found)
  {
    ellipse(mouseX,mouseY,10,10);
    textSize(32);
    fill(255,255,255);
    //throw up a message box they won
    println("You found the creeper...moving the creeper. Try again!");
    moveCreeper();    
  }
  else if (mousePressed)
  {
   ellipse(mouseX,mouseY,10,10);
 }
  
  
}

void moveCreeper()
{
  creepX = (int)random(1920-creepSize);
  creepY = (int)random(924-creepSize);
}
  
