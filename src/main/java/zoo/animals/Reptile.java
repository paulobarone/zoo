package zoo.animals;

import zoo.interfaces.Oviparous;

public abstract class Reptile extends Animal implements Oviparous {
  protected int numberOfEggs;

  public Reptile(String name, int age, String gender) {
    super(name, age, gender);
  }

  public void shedSkin() {
    System.out.println(name + " trocou de pele");
  }

  // Getters and Setters

  public int getNumberOfEggs() {
    return numberOfEggs;
  }

  public void setNumberOfEggs(int numberOfEggs) {
    this.numberOfEggs = numberOfEggs;
  }
}
