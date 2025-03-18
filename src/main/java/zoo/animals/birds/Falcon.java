package zoo.animals.birds;

import zoo.animals.Bird;

public class Falcon extends Bird {
  private int diveSpeed;

  public Falcon(String name, int age, String gender, int maxFlightSpeed) {
    super(name, age, gender,  maxFlightSpeed);
    this.diveSpeed = maxFlightSpeed * 2;
  }

  public void dive() {
    if(isDomesticated()) {
      System.out.println(name + " executou um mergulho vertical a " + diveSpeed + "km/h");
    } else {
      System.out.println(name + " não pode mergulhar, pois não está domesticado.");
    }
  }

  // Getters and Setters

  public int getDiveSpeed() {
    return diveSpeed;
  }

  public void setDiveSpeed(int diveSpeed) {
    this.diveSpeed = diveSpeed;
  }
}
