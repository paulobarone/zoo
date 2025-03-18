package zoo.interfaces;

public interface Hibernates {
  public String getName();
  public boolean isHibernating();
  public void setHibernation(boolean isHibernating);

  public default void startHibernation() {
    if(!isHibernating()) {
      setHibernation(true);
      System.out.println(getName() + " começou a hibernar.");
    } else {
      System.out.println(getName() + " já está hibernando.");
    }
  }

  public default void stopHibernation() {
    if(isHibernating()) {
      setHibernation(false);
      System.out.println(getName() + " acordou da hibernação.");
    } else {
      System.out.println(getName() + " não está hibernando.");
    }
  }
}
