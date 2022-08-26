package world;

public class Oak extends Plant {

  public Oak() {

    // Won't work -- type is private
    // type = "tree";

    // This works --- size is protected, Oak is a subclass of plant.
    this.size = "large";
    this.height = 122;
  }
}
