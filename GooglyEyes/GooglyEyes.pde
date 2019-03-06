
void setup()
{
 
 size(800,600);
   
}
  int leftX = 300;
  int leftY = 200;
  int rightX = 650;
  int rightY = 155;
  
void draw()
{
  PImage face = loadImage("download.jpg");
  face.resize(800,600);
  background(face); 

  leftY = (int)(105+((203-105)*(float)(mouseY/600.0)));
  leftX = (int)(150+((350-150)*(float)(mouseX/800.0)));

  rightX = leftX+300;
  rightY = leftY-25;

//eyeballs
  fill(255,255,255);
  ellipse(250,145,274,203);
  ellipse(560,133,280,205);  
 
 //pupils
  fill(0,0,0);
  ellipse(leftX, leftY, 50,50);
  ellipse(rightX, rightY, 50,50);  
}
