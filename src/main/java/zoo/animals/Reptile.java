package zoo.animals;

import zoo.interfaces.Oviparous;

import java.util.Random;

public abstract class Reptile extends Animal implements Oviparous {
  private boolean isVenomous;
  private boolean isColdBlooded;
  protected int numberOfEggs;
  protected boolean isHibernating;

  public Reptile(String name, int age, String gender, boolean isVenomous, boolean isColdBlooded) {
    super(name, age, gender);
    this.isVenomous = isVenomous;
    this.isColdBlooded = isColdBlooded;
    this.isHibernating = false;
  }

  @Override
  public void layEggs() {
    if (getGender().equals("F")) {
      if(!isHibernating) {
        if (numberOfEggs == 0) {
          Random random = new Random();
          int quantityEggs = random.nextInt(5);
          quantityEggs += 1;
          setNumberOfEggs(quantityEggs);

          if(quantityEggs == 1) {
            System.out.println(name + " botou " + quantityEggs + " ovo!");
          } else {
            System.out.println(name + " botou " + quantityEggs + " ovos!");
          }
        } else {
          System.out.println(name + " já possui ovos.");
        }
      } else {
        System.out.println(name + " não pode botar ovos, pois está hibernando.");
      }
    } else {
      System.out.println(name + " não pode botar ovos, pois é macho.");
    }
  }

  public void shedSkin() {
    if(!isHibernating) {
      System.out.println(name + " trocou de pele");
    } else {
      System.out.println(name + " não pode trocar de pele, pois está hibernando.");
    }
  }

  public void hibernate() {
    if(!isHibernating) {
      isHibernating = true;
      System.out.println(name + " agora está hibernando.");
    } else {
      System.out.println(name + " já está hibernando.");
    }
  }

  public void awakening() {
    if(isHibernating) {
      System.out.println(name + " despertou da hibernação.");
    } else {
      System.out.println(name + " não está hibernando.");
    }
  }

  // Getters and Setters

  public int getNumberOfEggs() {
    return numberOfEggs;
  }

  public void setNumberOfEggs(int numberOfEggs) {
    this.numberOfEggs = numberOfEggs;
  }

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
