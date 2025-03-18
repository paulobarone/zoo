package zoo.animals.mammal;

import zoo.animals.Mammal;
import zoo.interfaces.Hibernates;

public class Bear extends Mammal implements Hibernates {
  protected boolean isHibernating;

  public Bear(String name, int age, String gender) {
    super(name, age, gender);
    isHibernating = false;
  }

  // Getters and Setters

  public boolean isHibernating() {
    return false;
  }

  public void setHibernation(boolean isHibernating) {
    this.isHibernating = isHibernating;
  }
}