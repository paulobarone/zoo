package zoo.animals;

public abstract class Mammal extends Animal {
  private boolean isPregnant;

  public Mammal(String name, int age, double weight, String gender) {
    super(name, age, weight, gender);
    this.isPregnant = false;
  }

  public void nurse(Mammal animal) {
    if(gender.equals("F")) {
      if(animal.isBaby()) {
        System.out.println(name + " está amamentando " + animal.name + "...");
      } else {
        System.out.println(animal.name + " precisa ser um filhote para ser amamentado.");
      }
    } else {
      System.out.println(name + " não pode amamentar.");
    }
  }

  public void startGestation() {
    if(gender.equals("F")) {
      if(this.isBaby()) {
        isPregnant = true;
        System.out.println(name + " iniciou uma gestação.");
      } else {
        System.out.println(name + " não pode iniciar uma gestação, pois é um filhote.");
      }
    } else {
      System.out.println(name + " não pode iniciar uma gestação, pois é macho.");
    }
  }

  public void giveBirth() {
    if(isPregnant) {
      isPregnant = false;
      System.out.println(name + " deu à luz!");
    } else {
      System.out.println(name + " não está grávida.");
    }
  }
}
