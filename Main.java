import processing.core.PApplet;

/**
 * Main class to execute sketch
 * Creates a picture of a house, grass, and a sun
 * @E.Fung *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}