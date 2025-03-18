package zoo.animals.reptiles;

import zoo.animals.Reptile;

public class Snake extends Reptile {
  private boolean isVenomous;
  private boolean isColdBlooded;

  public Snake(String name, int age, String gender, boolean isVenomous, boolean isColdBlooded) {
    super(name, age, gender);
    this.isVenomous = isVenomous;
    this.isColdBlooded = isColdBlooded;
  }

  public void collectPoison() {
    if(isVenomous) {
      System.out.println("O veneno de " + name + " foi coletado.");
    } else {
      System.out.println(name + " não possui veneno.");
    }
  }

  // Getters and Setters

  public boolean isVenomous() {
    return isVenomous;
  }

  public void setVenomous(boolean venomous) {
    isVenomous = venomous;
  }

  public boolean isColdBlooded() {
    return isColdBlooded;
  }

  public void setColdBlooded(boolean coldBlooded) {
    isColdBlooded = coldBlooded;
  }
}
