package zoo.animals;

import zoo.interfaces.NestBuilder;
import zoo.interfaces.Oviparous;

import java.util.Random;

public abstract class Bird extends Animal implements Oviparous, NestBuilder {
  private boolean isDomesticated;
  private int maxFlightSpeed;
  private boolean hasNest;
  protected int numberOfEggs;

  public Bird(String name, int age, String gender, int maxFlightSpeed) {
    super(name, age, gender);
    this.maxFlightSpeed = maxFlightSpeed;
    this.isDomesticated = false;
    this.hasNest = false;
    this.numberOfEggs = 0;
  }

  public void tame() {
    isDomesticated = true;
    System.out.println(name + " foi domesticado.");
  }

  public void fly() {
    if(isDomesticated) {
      Random flightSpeed = new Random();
      int randomFlightSpeed = flightSpeed.nextInt(maxFlightSpeed + 1);
      if(randomFlightSpeed < 10) {
        randomFlightSpeed += 10;
      }
      System.out.println(name + " está voando a " + randomFlightSpeed + "km/h");
    } else {
      System.out.println(name + " não pode voar em liberdade, pois não está domesticado.");
    }
  }

  @Override
  public void layEggs() {
    if (gender.equals("F")) {
      if(hasNest) {
        if (numberOfEggs == 0) {
          Random random = new Random();
          int quantityEggs = random.nextInt(5);
          quantityEggs += 1;
          setNumberOfEggs(quantityEggs);

          if(quantityEggs == 1) {
            System.out.println(getName() + " botou " + quantityEggs + " ovo!");
          } else {
            System.out.println(name + " botou " + quantityEggs + " ovos!");
          }
        } else {
          System.out.println(name + " já possui ovos.");
        }
      } else {
        System.out.println(name + " não pode botar ovos, pois não tem um ninho.");
      }
    } else {
      System.out.println(name + " não pode botar ovos, pois é macho.");
    }
  }

  public void training() {
    if(isDomesticated) {
      Random random = new Random();
      int additionalSpeed = random.nextInt(26);
      if(additionalSpeed == 0) {
        additionalSpeed += 1;
      }

      maxFlightSpeed += additionalSpeed;
      System.out.println(name + " foi treinado e agora voa " + additionalSpeed + "km/h mais rápido!");
    } else {
      System.out.println(name + " não pode treinar, pois não é domesticado.");
    }
  }

  public void sing() {
    System.out.println(name + " está cantando!");
  }

  // Getters and Setters

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getGender() {
    return gender;
  }

  public boolean hasNest() {
    return hasNest;
  }

  public void setHasNest(boolean hasNest) {
    this.hasNest = hasNest;
  }

  public int getNumberOfEggs() {
    return numberOfEggs;
  }

  public void setNumberOfEggs(int numberOfEggs) {
    this.numberOfEggs = numberOfEggs;
  }

  public boolean isDomesticated() {
    return isDomesticated;
  }

  public void setDomesticated(boolean domesticated) {
    isDomesticated = domesticated;
  }

  public int getMaxFlightSpeed() {
    return maxFlightSpeed;
  }

  public void setMaxFlightSpeed(int maxFlightSpeed) {
    this.maxFlightSpeed = maxFlightSpeed;
  }

  public boolean isHasNest() {
    return hasNest;
  }
}
