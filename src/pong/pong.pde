int xPos;
int yPos;
int xSpeed = 5;
int ySpeed = 5;
int red = 200;
int green = 200;
int blue = 200;
int ballSize = 10;
int paddleSize = 40;
int paddleX = 0; 
int paddleY = 0;
int paddleSpeed = 5;
int lives = 5;

PImage backgroundImage; //at the top of your sketch

void setup ()
{
  backgroundImage = loadImage("image.jpg"); //in the setup method
  size(667,1051);
  paddleX = (width/2) - (paddleSize/2);
  paddleY = (height - 20);
  xPos = width/2;
  yPos = 10;
  
}

void draw() 
{
  image(backgroundImage, 0, 0); //in draw method
  text(lives, 30,30);
  //image(backgroundImage, 0, 0, width, height); //if you want to resize
xPos += xSpeed;
if((xPos>width-ballSize) || (xPos < 0))
{
  xSpeed = -xSpeed;
  xPos += xSpeed;
}

  yPos += ySpeed;
if(yPos < 0)
{
  ySpeed = -ySpeed;
  yPos =0; //+= ySpeed;
}

ellipse(xPos, yPos, ballSize, ballSize); //in draw method
fill(red, green, blue); //in draw method
stroke(red, green, blue); //in draw method

rect(paddleX, paddleY, paddleSize, ballSize);
if(intersects(xPos, yPos+ballSize, paddleX, paddleY, paddleSize))
{
  ySpeed = -ySpeed;
}

if(yPos>height-ballSize)
{
  lives -=1;
  if(lives == 0)
  {
    print("Game over");
    System.exit(0);
  }
  xPos = width/2;
  yPos = 10;
 
}
/*
if(keyPressed)
{
  print(keyCode);
  if(keyCode == 39)
  {
    if(paddleX < (width-paddleSize))
    {
      paddleX = paddleX + paddleSpeed;
    }
  } else if (keyCode == 37)
  {
    if(paddleX > 0)
    {
      paddleX = paddleX - paddleSpeed;
    }
  }
}
  */
  
  paddleX = mouseX-(paddleSize/2);
  if(paddleX<0)
  {
    paddleX = 0;
  }
  if(paddleX>width-paddleSize)
  {
    paddleX = paddleSize;
  }
    
  
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY,
int paddleLength) {
    if ((ballY > paddleY) && (ballX > paddleX) && (ballX < paddleX + paddleLength))        
      return true;
    else
        return false;
}
