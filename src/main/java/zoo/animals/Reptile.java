package zoo.animals;

import zoo.interfaces.Oviparous;

public abstract class Reptile extends Animal implements Oviparous {
  private boolean isVenomous;
  private boolean isColdBlooded;
  protected int numberOfEggs;

  public Reptile(String name, int age, String gender, boolean isVenomous, boolean isColdBlooded) {
    super(name, age, gender);
    this.isVenomous = isVenomous;
    this.isColdBlooded = isColdBlooded;
  }

  public void shedSkin() {
    System.out.println(name + " trocou de pele.");
  }

  public void hibernate() {
    System.out.println(name + " agora está hibernando.");
  }

  public void awakening() {
    System.out.println(name + " despertou da hibernação.");
  }

  public int getNumberOfEggs() {
    return numberOfEggs;
  }

  public void setNumberOfEggs(int numberOfEggs) {
    this.numberOfEggs = numberOfEggs;
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
