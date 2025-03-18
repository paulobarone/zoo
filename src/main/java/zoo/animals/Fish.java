package zoo.animals;

import zoo.interfaces.Oviparous;

public abstract class Fish extends Animal implements Oviparous {
  private String waterType;
  protected int numberOfEggs;

  public Fish(String name, int age, String gender, String waterType) {
    super(name, age, gender);
    this.waterType = waterType;
  }

  public void swim() {
    System.out.println(name + " está nadando.");
  }

  // Getters and Setters

  public String getWaterType() {
    return waterType;
  }

  public void setWaterType(String waterType) {
    this.waterType = waterType;
  }

  public int getNumberOfEggs() {
    return numberOfEggs;
  }

  public void setNumberOfEggs(int numberOfEggs) {
    this.numberOfEggs = numberOfEggs;
  }
}
