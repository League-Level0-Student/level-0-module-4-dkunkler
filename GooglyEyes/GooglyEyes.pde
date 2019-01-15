
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
  if(mouseY < 145-203/4)
   {
     leftY = 145-203/4;
   } else if(mouseY > 145+203/4)
   {
     leftY = 145+203/4;
   } else
   {
     leftY = mouseY;
   }
 
 
 if  (mouseX < 250-274/4)
   {
     leftX = 250-274/4;
   } else if (mouseX > 250+274/4)
   {
     leftX = 250+274/4;
   } else
   {
     leftX = mouseX;
   }
// right eye 
  if(mouseY < 133-205/4)
   {
     rightY = 133-205/4;
   } else if(mouseY > 133+205/4)
   {
     rightY = 133+205/4;
   } else
   {
     rightY = mouseY;
   }
 
 
 if  (mouseX < 560-280/4)
   {
     rightX = 560-280/4;
   } else if (mouseX > 560+280/4)
   {
     rightX = 560+280/4;
   } else
   {
     rightX = mouseX;
   }
 
  
  fill(255,255,255);
  ellipse(250,145,274,203);
  ellipse(560,133,280,205);  
 
  fill(0,0,0);
  ellipse(leftX, leftY, 50,50);
  ellipse(rightX, rightY, 50,50);  
}
