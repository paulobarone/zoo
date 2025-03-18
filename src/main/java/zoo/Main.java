package zoo;

import zoo.animals.birds.Falcon;
import zoo.animals.reptiles.Snake;

public class Main {
  public static void main(String[] args) {
    Snake r = new Snake("Cobra", 5, "F", true, true);
    Falcon b = new Falcon("Falcão", 5, "F", 85);

    r.layEggs();
    r.hatchEggs();

    b.layEggs();
    b.buildNest();
    b.layEggs();
    b.hatchEggs();
  }
}