package zoo.interfaces;

public interface NestBuilder {
  public String getName();
  public boolean hasNest();
  public void setHasNest(boolean hasNest);

  public default void buildNest() {
    if (!hasNest()) {
      setHasNest(true);
      System.out.println(getName() + " construiu um ninho!");
    } else {
      System.out.println(getName() + " já possui um ninho.");
    }
  }
}
