package zoo.animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected double weight;
  protected String gender;
  private boolean isSleeping;
  private final boolean isBaby;

  public Animal(String name, int age, double weight, String gender) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.gender = gender;
    this.isBaby = this.age < 1;
  }

  public void eat() {
    System.out.println(name + " está comendo...");
  };

  public void sleep() {
    isSleeping = true;
    System.out.println(name + " está dormindo...");
  }

  public void walkingUp() {
    isSleeping = false;
    System.out.println(name + " está acordando...");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public double getWeight() {
    return weight;
  }

  public String getGender() {
    if(gender.equals("F")) {
      return "Feminino";
    } else {
      return "Masculino";
    }
  }

  public boolean isBaby() {
    return isBaby;
  }

  public boolean isSleeping() {
    return isSleeping;
  }
}
