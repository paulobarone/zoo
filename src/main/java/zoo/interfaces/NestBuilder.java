package zoo.interfaces;

public interface NestBuilder {
  String getName();
  boolean haveNest();
  void setHaveNest(boolean haveNest);

  public default void buildNest() {
    if (!haveNest()) {
      setHaveNest(true);
      System.out.println(getName() + " construiu um ninho!");
    } else {
      System.out.println(getName() + " já possui um ninho.");
    }
  }
}
