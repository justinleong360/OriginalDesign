import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int size = 20; 
public void setup() 
{ 
size(700, 700); 
background(255,255,255); 
} 

public void draw() 
{ 
keyPressed(); 
} 
//need draw or else mouse and keyboard events don't work 

public void mouseDragged() 
{ 
fill((int)(Math.random()*251),(int)(Math.random()*251),(int)(Math.random()*251));
ellipse(mouseX,mouseY, size, size); 
}

public void keyPressed() 
{
if (keyPressed) {if (key == 'r') 
 
background(255,255,255); }  
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
