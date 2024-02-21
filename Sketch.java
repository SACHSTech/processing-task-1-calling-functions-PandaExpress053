import processing.core.PApplet;



public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   * Main class to execute sketch
   *Creates a picture of a house, grass, and a sun
   * @E.Fung
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
  public void setup() {
    //Creating blue background
    background(0, 0, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    //Creating green foreground
    fill(0, 255, 0);
    rect(0,300,400,400);

    //Creating gray square house base
    fill(150, 150, 150);
    rect(150, 335, 200, -200);

    //Creating white triangle roof
    fill(255, 255, 255);
    triangle(150,135,250, 80, 350, 135);

    //Creating circular yellow sun in top left corner
    fill(255,255,150);
    ellipse(25, 25, 150, 150);
  }
  // define other methods down here.
}