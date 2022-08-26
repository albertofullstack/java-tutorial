package world;

/*
* private     --- only within same class
* public      --- from anywhere
* protected   --- subclass, and same package
* no modifier --- same package only
 */
public class Plant {

  // Bad practice
  public String name;

  // Acceptable practice --- it's final.
  public final static int ID = 8;

  protected String size;

  private String type;

  // If no accessor by default is package level visibility
  int height;

  public Plant() {

    this.name = "Aloe vera";
    this.type = "plant";
    this.size = "medium";
    this.height = 8;
  }
}
