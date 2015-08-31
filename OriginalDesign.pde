void setup() 
{ 
size(700, 700); 
background(255,255,255); 
} 

void draw() 
{ 
keyPressed(); 
} 
//need draw or else mouse and keyboard events don't work 

void mouseDragged() 
{ 
fill((int)(Math.random()*251),(int)(Math.random()*251),(int)(Math.random()*251));
ellipse(mouseX,mouseY, 20, 20); 
}

void keyPressed() 
{
if (keyPressed) {if (key == 'r') 
 
background(255,255,255); }  
}

