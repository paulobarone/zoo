package zoo.animals;

import java.util.Random;

public abstract class Bird extends Animal{
  private boolean isDomesticated;
  private int maxFlightSpeed;
  private boolean haveNest;
  private int eggs;

  public Bird(String name, int age, double weight, String gender, int maxFlightSpeed) {
    super(name, age, weight, gender);
    this.maxFlightSpeed = maxFlightSpeed;
    this.isDomesticated = false;
    this.haveNest = false;
    this.eggs = 0;
  }

  public void tame() {
    isDomesticated = true;
    System.out.println(name + " foi domesticado.");
  }

  public void fly() {
    if(isDomesticated) {
      Random flightSpeed = new Random();
      System.out.println(name + " está voando a " + flightSpeed.nextInt(maxFlightSpeed + 1) + "km/h");
    } else {
      System.out.println(name + " não pode voar em liberdade, pois não está domesticado.");
    }
  }

  public void buildNest() {
    if(!haveNest) {
      haveNest = true;
      System.out.println(name + " construiu seu ninho.");
    } else {
      System.out.println(name + " já possui um ninho.");
    }
  }

  public void layEggs() {
    if(gender.equals("F")) {
      if(haveNest) {
        if(eggs == 0) {
          Random random = new Random();
          int quantityEggs = random.nextInt(5);
          eggs = quantityEggs;
          System.out.println(name + " botou " + quantityEggs + " ovos!");
        } else {
          System.out.println(name + " já possui ovos.");
        }
      } else {
        System.out.println(name + " não possui um ninho.");
      }
    } else {
      System.out.println(name + " não pode botar ovos, pois é macho.");
    }
  }

  public void hatchEggs() {
    if(eggs > 0) {
      if(eggs > 1) {
        System.out.println("Os " + eggs + " ovos de " + name + " chocaram!");
      } else {
        System.out.println("O ovo de " + name + " chocou!");
      }
      eggs = 0;
    } else {
      System.out.println(name + " não possui ovos.");
    }
  }

  public void training() {
    if(isDomesticated) {
      Random random = new Random();
      int additionalSpeed = random.nextInt(26);

      maxFlightSpeed += additionalSpeed;
      System.out.println(name + " agora voa " + additionalSpeed + "km/h mais rápido!");
    } else {
      System.out.println(name + " não pode treinar, pois não é domesticado.");
    }
  }
}
