PImage donkey;
PImage tail;

int tailX;
int tailY;

boolean pinned;

import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

void setup()
{
  donkey = loadImage("donkey2.jpg");      //change the file name if you need to
  tail = loadImage("foxtailalpha.png");      //change the file name if you need to
  size(1280, 720);
  tail.resize(200,200);
  pinned = false;
  
  Minim minim = new Minim(this);     //In the setup method
  woohooSound = minim.loadSample("whoo.wav");     //In setup. Change the file name if you need to
}

void draw()
{
  if((dist(0, 0, mouseX, mouseY) < 30) || pinned)
  {
    background (donkey);
    
  }
  else
  {
    background(0,0,0);
  }
  
  if(!pinned)
  {
    tailX = mouseX;
    tailY = mouseY;
  }
  
  if(mousePressed && !pinned)
  {
    pinned = true;
    if(dist(1060,250,mouseX,mouseY) < 50)
    {
      println("You win");
      if (playSound) {
       woohooSound.trigger();
       playSound = false;
      }
    }
    
  }
  
  
  image(tail, tailX, tailY-50);
  
  
  
  
  //debugging squares
  //rect(0, 0, 30, 30);
  //rect(1060, 250, 50, 50);
}
