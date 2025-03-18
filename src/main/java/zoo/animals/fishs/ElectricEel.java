package zoo.animals.fishs;

import zoo.animals.Fish;

public class ElectricEel extends Fish {
  private boolean isElectric;

  public ElectricEel(String name, int age, String gender, String waterType, boolean isElectric) {
    super(name, age, gender, waterType);
  }

  public void generateElectricity() {
    System.out.println(name + " gerou eletricidade ao seu redor.");
  }

  // Getters and Setters

  public boolean isElectric() {
    return isElectric;
  }

  public void setElectric(boolean electric) {
    isElectric = electric;
  }
}
