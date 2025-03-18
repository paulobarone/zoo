package zoo.interfaces;

import java.util.Random;

public interface Oviparous {
  public String getName();
  public String getGender();
  public int getNumberOfEggs();
  public void setNumberOfEggs(int numberOfEggs);

  public default void layEggs() {
    if (getGender().equals("F")) {
      if (getNumberOfEggs() == 0) {
        Random random = new Random();
        int quantityEggs = random.nextInt(5);
        quantityEggs += 1;
        setNumberOfEggs(quantityEggs);

        if(quantityEggs == 1) {
          System.out.println(getName() + " botou " + quantityEggs + " ovo!");
        } else {
          System.out.println(getName() + " botou " + quantityEggs + " ovos!");
        }
      } else {
        System.out.println(getName() + " já possui ovos.");
      }
    } else {
      System.out.println(getName() + " não pode botar ovos, pois é macho.");
    }
  }

  public default void hatchEggs() {
    if (getNumberOfEggs() > 0) {
      if (getNumberOfEggs() > 1) {
        System.out.println("Os " + getNumberOfEggs() + " ovos de " + getName() + " chocaram!");
      } else {
        System.out.println("O ovo de " + getName() + " chocou!");
      }
      setNumberOfEggs(0);
    } else {
      System.out.println(getName() + " não possui ovos.");
    }
  }
}
