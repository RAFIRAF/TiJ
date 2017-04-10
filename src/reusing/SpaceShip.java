package reusing;//: reusing/SpaceShip.java

public class SpaceShip {
  private final SpaceShipControls spaceShipControls = new SpaceShipControls();
  private String name;
  public SpaceShip(String name) { this.name = name; }
  public String toString() { return name; }
  public static void main(String[] args) {
    SpaceShip protector = new SpaceShip("NSEA Protector");
    protector.forward(100);
  }

  void up(int velocity) {
    spaceShipControls.up(velocity);
  }

  void down(int velocity) {
    spaceShipControls.down(velocity);
  }

  void left(int velocity) {
    spaceShipControls.left(velocity);
  }

  void right(int velocity) {
    spaceShipControls.right(velocity);
  }

  void forward(int velocity) {
    spaceShipControls.forward(velocity);
  }

  void back(int velocity) {
    spaceShipControls.back(velocity);
  }

  void turboBoost() {
    spaceShipControls.turboBoost();
  }
} ///:~
